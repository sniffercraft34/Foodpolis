/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ 
/*    */ public class ChocolateBiscuitItem
/*    */   extends Item {
/*    */   public ChocolateBiscuitItem() {
/* 10 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4F).build()));
/*    */   }
/*    */ }


