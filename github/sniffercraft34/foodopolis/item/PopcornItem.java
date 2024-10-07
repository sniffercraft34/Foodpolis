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
/*    */ public class PopcornItem
/*    */   extends Item {
/*    */   public PopcornItem() {
/* 16 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.7F).build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasCraftingRemainingItem() {
/* 21 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
/* 26 */     return new ItemStack((ItemLike)FoodopolisModItems.STALK.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 31 */     return 35;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 36 */     ItemStack retval = new ItemStack((ItemLike)FoodopolisModItems.BOX.get());
/* 37 */     super.finishUsingItem(itemstack, world, entity);
/* 38 */     if (itemstack.isEmpty()) {
/* 39 */       return retval;
/*    */     }
/* 41 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 42 */         !player.getInventory().add(retval))
/* 43 */         player.drop(retval, false);  }
/*    */     
/* 45 */     return itemstack;
/*    */   }
/*    */ }

