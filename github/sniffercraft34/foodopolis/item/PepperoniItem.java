/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ 
/*    */ public class PepperoniItem
/*    */   extends Item {
/*    */   public PepperoniItem() {
/* 10 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build()));
/*    */   }
/*    */ }


