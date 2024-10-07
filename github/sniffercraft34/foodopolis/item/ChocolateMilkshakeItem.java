/*    */ package github.sniffercraft34.foodopolis.item;
/*    */ 
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
/*    */ public class ChocolateMilkshakeItem extends Item {
/*    */   public ChocolateMilkshakeItem() {
/* 15 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.7F).alwaysEdible().build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 20 */     ItemStack retval = new ItemStack((ItemLike)Items.GLASS_BOTTLE);
/* 21 */     super.finishUsingItem(itemstack, world, entity);
/* 22 */     if (itemstack.isEmpty()) {
/* 23 */       return retval;
/*    */     }
/* 25 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 26 */         !player.getInventory().add(retval))
/* 27 */         player.drop(retval, false);  }
/*    */     
/* 29 */     return itemstack;
/*    */   }
/*    */ }


