/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
/*    */ import github.sniffercraft34.foodopolis.init.FoodopolisModItems;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class VanillaIceCreamItem
/*    */   extends Item {
/*    */   public VanillaIceCreamItem() {
/* 17 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.5F).build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasCraftingRemainingItem() {
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
/* 27 */     return new ItemStack((ItemLike)Items.BUCKET);
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 32 */     ItemStack retval = new ItemStack((ItemLike)FoodopolisModItems.ICE_CREAM_CONE.get());
/* 33 */     super.finishUsingItem(itemstack, world, entity);
/* 34 */     if (itemstack.isEmpty()) {
/* 35 */       return retval;
/*    */     }
/* 37 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 38 */         !player.getInventory().add(retval))
/* 39 */         player.drop(retval, false);  }
/*    */     
/* 41 */     return itemstack;
/*    */   }
/*    */ }

