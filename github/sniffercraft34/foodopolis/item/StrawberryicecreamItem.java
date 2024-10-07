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
/*    */ public class StrawberryicecreamItem
/*    */   extends Item {
/*    */   public StrawberryicecreamItem() {
/* 16 */     super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.5F).build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 21 */     ItemStack retval = new ItemStack((ItemLike)FoodopolisModItems.ICE_CREAM_CONE.get());
/* 22 */     super.finishUsingItem(itemstack, world, entity);
/* 23 */     if (itemstack.isEmpty()) {
/* 24 */       return retval;
/*    */     }
/* 26 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 27 */         !player.getInventory().add(retval))
/* 28 */         player.drop(retval, false);  }
/*    */     
/* 30 */     return itemstack;
/*    */   }
/*    */ }

