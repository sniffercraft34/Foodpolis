/*    */ package github.sniffercraft34.foodopolis;
/*    */ 
/*    */ import github.sniffercraft34.foodopolis.init.FoodopolisModItems;
/*    */ import github.sniffercraft34.foodopolis.init.FoodopolisModTabs;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.codec.StreamCodec;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.util.Tuple;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.Mod;
/*    */ import net.neoforged.fml.util.thread.SidedThreadGroups;
/*    */ import net.neoforged.neoforge.common.NeoForge;
/*    */ import net.neoforged.neoforge.event.tick.ServerTickEvent;
/*    */ import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadHandler;
/*    */ import net.neoforged.neoforge.network.registration.PayloadRegistrar;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("foodopolis")
/*    */ public class FoodopolisMod
/*    */ {
/* 33 */   public static final Logger LOGGER = LogManager.getLogger(FoodopolisMod.class);
/*    */   
/*    */   public static final String MODID = "foodopolis";
/*    */ 
/*    */   
/*    */   public FoodopolisMod(IEventBus modEventBus) {
/* 39 */     NeoForge.EVENT_BUS.register(this);
/* 40 */     modEventBus.addListener(this::registerNetworking);
/*    */     
/* 42 */     FoodopolisModItems.REGISTRY.register(modEventBus);
/*    */     
/* 44 */     FoodopolisModTabs.REGISTRY.register(modEventBus);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static boolean networkingRegistered = false;
/*    */ 
/*    */   
/* 53 */   private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();
/*    */   private static final class NetworkMessage<T extends CustomPacketPayload> extends Record { private final StreamCodec<? extends FriendlyByteBuf, T> reader; private final IPayloadHandler<T> handler;
/* 55 */     private NetworkMessage(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) { this.reader = reader; this.handler = handler; } public final String toString() { // Byte code:

/*    */   
/*    */   public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
/* 59 */     if (networkingRegistered)
/* 60 */       throw new IllegalStateException("Cannot register new network messages after networking has been registered"); 
/* 61 */     MESSAGES.put(id, new NetworkMessage(reader, handler));
/*    */   }
/*    */ 
/*    */   
/*    */   private void registerNetworking(RegisterPayloadHandlersEvent event) {
/* 66 */     PayloadRegistrar registrar = event.registrar("foodopolis");
/* 67 */     MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, networkMessage.reader(), networkMessage.handler()));
/* 68 */     networkingRegistered = true;
/*    */   }
/*    */   
/* 71 */   private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
/*    */   
/*    */   public static void queueServerWork(int tick, Runnable action) {
/* 74 */     if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
/* 75 */       workQueue.add(new Tuple(action, Integer.valueOf(tick))); 
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(ServerTickEvent.Post event) {
/* 80 */     List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
/* 81 */     workQueue.forEach(work -> {
/*    */           work.setB(Integer.valueOf(((Integer)work.getB()).intValue() - 1));
/*    */           if (((Integer)work.getB()).intValue() == 0)
/*    */             actions.add(work); 
/*    */         });
/* 86 */     actions.forEach(e -> ((Runnable)e.getA()).run());
/* 87 */     workQueue.removeAll(actions);
/*    */   }
/*    */ }


