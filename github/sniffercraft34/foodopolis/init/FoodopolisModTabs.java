/*     */ package github.sniffercraft34.foodopolis.init;
/*     */ 
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.world.item.CreativeModeTab;
/*     */ import net.minecraft.world.item.CreativeModeTabs;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.neoforged.bus.api.SubscribeEvent;
/*     */ import net.neoforged.fml.common.EventBusSubscriber;
/*     */ import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
/*     */ import net.neoforged.neoforge.registries.DeferredHolder;
/*     */ import net.neoforged.neoforge.registries.DeferredRegister;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
/*     */ public class FoodopolisModTabs
/*     */ {
/*  23 */   public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "foodopolis");
/*  24 */   public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FOODOPOLIS = REGISTRY.register("foodopolis", () -> CreativeModeTab.builder().title((Component)Component.translatable("item_group.foodopolis.foodopolis")).icon(()).displayItems(()).build());
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
/* 102 */     if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
/* 103 */       tabData.accept((ItemLike)FoodopolisModItems.INGREDIENT.get());
/* 104 */       tabData.accept((ItemLike)FoodopolisModItems.STALK.get());
/* 105 */       tabData.accept((ItemLike)FoodopolisModItems.ICE_CREAM_CONE.get());
/* 106 */       tabData.accept((ItemLike)FoodopolisModItems.BATTER.get());
/* 107 */       tabData.accept((ItemLike)FoodopolisModItems.BOX.get());
/* 108 */       tabData.accept((ItemLike)FoodopolisModItems.SUGAR_CUBE.get());
/* 109 */       tabData.accept((ItemLike)FoodopolisModItems.SPICE.get());
/* 110 */       tabData.accept((ItemLike)FoodopolisModItems.JAR.get());
/* 111 */     } else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
/* 112 */       tabData.accept((ItemLike)FoodopolisModItems.INGREDIENT.get());
/* 113 */       tabData.accept((ItemLike)FoodopolisModItems.APPLE_JUICE.get());
/* 114 */       tabData.accept((ItemLike)FoodopolisModItems.ORANGE.get());
/* 115 */       tabData.accept((ItemLike)FoodopolisModItems.STALK.get());
/* 116 */       tabData.accept((ItemLike)FoodopolisModItems.ORANGE_JUICE.get());
/* 117 */       tabData.accept((ItemLike)FoodopolisModItems.ICE_CREAM_CONE.get());
/* 118 */       tabData.accept((ItemLike)FoodopolisModItems.VANILLA_ICE_CREAM.get());
/* 119 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY.get());
/* 120 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRYICECREAM.get());
/* 121 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY_JUICE.get());
/* 122 */       tabData.accept((ItemLike)FoodopolisModItems.CHOCOLATE.get());
/* 123 */       tabData.accept((ItemLike)FoodopolisModItems.WHITE_CHOCOLATE.get());
/* 124 */       tabData.accept((ItemLike)FoodopolisModItems.CHIP.get());
/* 125 */       tabData.accept((ItemLike)FoodopolisModItems.BATTER.get());
/* 126 */       tabData.accept((ItemLike)FoodopolisModItems.FISHAND_CHIPS.get());
/* 127 */       tabData.accept((ItemLike)FoodopolisModItems.SUGAR_CUBE.get());
/* 128 */       tabData.accept((ItemLike)FoodopolisModItems.MARSHMALLOW.get());
/* 129 */       tabData.accept((ItemLike)FoodopolisModItems.FRIED_EGG.get());
/* 130 */       tabData.accept((ItemLike)FoodopolisModItems.CHEESE.get());
/* 131 */       tabData.accept((ItemLike)FoodopolisModItems.CHEESE_SANDWICH.get());
/* 132 */       tabData.accept((ItemLike)FoodopolisModItems.HAM.get());
/* 133 */       tabData.accept((ItemLike)FoodopolisModItems.HAM_SANDWICH.get());
/* 134 */       tabData.accept((ItemLike)FoodopolisModItems.CHOCOLATE_ICE_CREAM.get());
/* 135 */       tabData.accept((ItemLike)FoodopolisModItems.TOMATO.get());
/* 136 */       tabData.accept((ItemLike)FoodopolisModItems.PIZZA.get());
/* 137 */       tabData.accept((ItemLike)FoodopolisModItems.PEPPERONI.get());
/* 138 */       tabData.accept((ItemLike)FoodopolisModItems.SPICE.get());
/* 139 */       tabData.accept((ItemLike)FoodopolisModItems.CARAMEL.get());
/* 140 */       tabData.accept((ItemLike)FoodopolisModItems.BISCUIT.get());
/* 141 */       tabData.accept((ItemLike)FoodopolisModItems.CHOCOLATE_BISCUIT.get());
/* 142 */       tabData.accept((ItemLike)FoodopolisModItems.PIZZA_SLICE.get());
/* 143 */       tabData.accept((ItemLike)FoodopolisModItems.BURGER.get());
/* 144 */       tabData.accept((ItemLike)FoodopolisModItems.CHEESE_BURGER.get());
/* 145 */       tabData.accept((ItemLike)FoodopolisModItems.PINEAPPLE.get());
/* 146 */       tabData.accept((ItemLike)FoodopolisModItems.PINEAPPLE_RING.get());
/* 147 */       tabData.accept((ItemLike)FoodopolisModItems.CUPCAKE.get());
/* 148 */       tabData.accept((ItemLike)FoodopolisModItems.DONUT.get());
/* 149 */       tabData.accept((ItemLike)FoodopolisModItems.BANANA.get());
/* 150 */       tabData.accept((ItemLike)FoodopolisModItems.FRENCH_FRIES.get());
/* 151 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY_LOLLIEPOP.get());
/* 152 */       tabData.accept((ItemLike)FoodopolisModItems.LEMON.get());
/* 153 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY_ICE_LOLLY.get());
/* 154 */       tabData.accept((ItemLike)FoodopolisModItems.LEMON_LOLLIEPOP.get());
/* 155 */       tabData.accept((ItemLike)FoodopolisModItems.LEMONADE_ICE_LOLLY.get());
/* 156 */       tabData.accept((ItemLike)FoodopolisModItems.RICE.get());
/* 157 */       tabData.accept((ItemLike)FoodopolisModItems.SUSHI.get());
/* 158 */       tabData.accept((ItemLike)FoodopolisModItems.CROISSANT.get());
/* 159 */       tabData.accept((ItemLike)FoodopolisModItems.PAIN_AU_CHOCOLAT.get());
/* 160 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY_JAM.get());
/* 161 */       tabData.accept((ItemLike)FoodopolisModItems.LEMON_CURD.get());
/* 162 */       tabData.accept((ItemLike)FoodopolisModItems.ORANGE_MARMALADE.get());
/* 163 */       tabData.accept((ItemLike)FoodopolisModItems.CHICKEN_NUGGETS.get());
/* 164 */       tabData.accept((ItemLike)FoodopolisModItems.TOAST.get());
/* 165 */       tabData.accept((ItemLike)FoodopolisModItems.BUTTER.get());
/* 166 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY_JAM_ON_TOAST.get());
/* 167 */       tabData.accept((ItemLike)FoodopolisModItems.LEMON_CURD_ON_TOAST.get());
/* 168 */       tabData.accept((ItemLike)FoodopolisModItems.ORANGE_MARMALADE_ON_TOAST.get());
/* 169 */       tabData.accept((ItemLike)FoodopolisModItems.HOT_CHOCOLATE.get());
/* 170 */       tabData.accept((ItemLike)FoodopolisModItems.WHITE_HOT_CHOCOLATE.get());
/* 171 */       tabData.accept((ItemLike)FoodopolisModItems.LEMONADE.get());
/* 172 */       tabData.accept((ItemLike)FoodopolisModItems.CORN.get());
/* 173 */       tabData.accept((ItemLike)FoodopolisModItems.POPCORN.get());
/* 174 */       tabData.accept((ItemLike)FoodopolisModItems.VANILLA_MILKSHAKE.get());
/* 175 */       tabData.accept((ItemLike)FoodopolisModItems.STRAWBERRY_MILKSHAKE.get());
/* 176 */       tabData.accept((ItemLike)FoodopolisModItems.CHOCOLATE_MILKSHAKE.get());
/* 177 */       tabData.accept((ItemLike)FoodopolisModItems.PASTA.get());
/* 178 */       tabData.accept((ItemLike)FoodopolisModItems.MAC_AND_CHEESE.get());
/* 179 */       tabData.accept((ItemLike)FoodopolisModItems.LASAGNA.get());
/*     */     } 
/*     */   }
/*     */ }


