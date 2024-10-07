/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class VanillaMilkshakeItem extends Item {
/*    */   public VanillaMilkshakeItem() {
/* 16 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.6F).alwaysEdible().build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 21 */     return UseAnim.DRINK;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasCraftingRemainingItem() {
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
/* 31 */     return new ItemStack((ItemLike)Items.BUCKET);
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 36 */     ItemStack retval = new ItemStack((ItemLike)Items.GLASS_BOTTLE);
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

