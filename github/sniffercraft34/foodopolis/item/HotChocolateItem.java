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
/*    */ public class HotChocolateItem extends Item {
/*    */   public HotChocolateItem() {
/* 16 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.7F).alwaysEdible().build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 21 */     return UseAnim.DRINK;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 26 */     ItemStack retval = new ItemStack((ItemLike)Items.GLASS_BOTTLE);
/* 27 */     super.finishUsingItem(itemstack, world, entity);
/* 28 */     if (itemstack.isEmpty()) {
/* 29 */       return retval;
/*    */     }
/* 31 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 32 */         !player.getInventory().add(retval))
/* 33 */         player.drop(retval, false);  }
/*    */     
/* 35 */     return itemstack;
/*    */   }
/*    */ }



