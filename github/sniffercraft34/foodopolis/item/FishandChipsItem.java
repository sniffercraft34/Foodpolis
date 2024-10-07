/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import github.sniffercraft34.foodopolis.init.FoodopolisModItems;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class FishandChipsItem
/*    */   extends Item {
/*    */   public FishandChipsItem() {
/* 16 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationModifier(0.7F).build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasCraftingRemainingItem() {
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
/* 26 */     return new ItemStack((ItemLike)FoodopolisModItems.BOX.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 31 */     ItemStack retval = new ItemStack((ItemLike)FoodopolisModItems.BOX.get());
/* 32 */     super.finishUsingItem(itemstack, world, entity);
/* 33 */     if (itemstack.isEmpty()) {
/* 34 */       return retval;
/*    */     }
/* 36 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 37 */         !player.getInventory().add(retval))
/* 38 */         player.drop(retval, false);  }
/*    */     
/* 40 */     return itemstack;
/*    */   }
/*    */ }


