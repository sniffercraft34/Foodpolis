/*    */ package github.sniffercraft34.foodopolis;
/*    */ 
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.codec.StreamCodec;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class NetworkMessage<T extends CustomPacketPayload>
/*    */   extends Record
/*    */ {
/*    */   private final StreamCodec<? extends FriendlyByteBuf, T> reader;
/*    */   private final IPayloadHandler<T> handler;
/*    */   
/*    */   public final String toString() {

/*    */   }
/*    */   
/*    */   public final int hashCode() {
/*    
/*    */   }
/*    */   
/*    */   public final boolean equals(Object o) {
/*    */  
/*    */   }
/*    */   
/*    */   private NetworkMessage(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
/* 55 */     this.reader = reader; this.handler = handler; } public StreamCodec<? extends FriendlyByteBuf, T> reader() { return this.reader; } public IPayloadHandler<T> handler() { return this.handler; }
/*    */ 
/*    */ }


