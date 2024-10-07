/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ 
/*    */ public class CheeseSandwichItem
/*    */   extends Item {
/*    */   public CheeseSandwichItem() {
/* 10 */     super((new Item.Properties()).stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.6F).build()));
/*    */   }
/*    */ }

