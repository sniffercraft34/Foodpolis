/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class CheeseItem extends Item {
/*    */   public CheeseItem() {
/* 12 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3F).build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasCraftingRemainingItem() {
/* 17 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
/* 22 */     return new ItemStack((ItemLike)Items.BUCKET);
/*    */   }
/*    */ }

