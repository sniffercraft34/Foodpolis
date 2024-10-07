/*     */ package github.sniffercraft34.foodopolis.init;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.neoforged.neoforge.registries.DeferredHolder;
/*     */ import net.neoforged.neoforge.registries.DeferredRegister;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 

/*     */ public class FoodopolisModItems
/*     */ {
/*  85 */   public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems("foodopolis");
/*  86 */   public static final DeferredHolder<Item, Item> INGREDIENT = (DeferredHolder<Item, Item>)REGISTRY.register("ingredient", github.sniffercraft34.foodopolis.item.IngredientItem::new);
/*  87 */   public static final DeferredHolder<Item, Item> APPLE_JUICE = (DeferredHolder<Item, Item>)REGISTRY.register("apple_juice", github.sniffercraft34.foodopolis.item.AppleJuiceItem::new);
/*  88 */   public static final DeferredHolder<Item, Item> ORANGE = (DeferredHolder<Item, Item>)REGISTRY.register("orange", github.sniffercraft34.foodopolis.item.OrangeItem::new);
/*  89 */   public static final DeferredHolder<Item, Item> STALK = (DeferredHolder<Item, Item>)REGISTRY.register("stalk", github.sniffercraft34.foodopolis.item.StalkItem::new);
/*  90 */   public static final DeferredHolder<Item, Item> ORANGE_JUICE = (DeferredHolder<Item, Item>)REGISTRY.register("orange_juice", github.sniffercraft34.foodopolis.item.OrangeJuiceItem::new);
/*  91 */   public static final DeferredHolder<Item, Item> ICE_CREAM_CONE = (DeferredHolder<Item, Item>)REGISTRY.register("ice_cream_cone", github.sniffercraft34.foodopolis.item.IceCreamConeItem::new);
/*  92 */   public static final DeferredHolder<Item, Item> VANILLA_ICE_CREAM = (DeferredHolder<Item, Item>)REGISTRY.register("vanilla_ice_cream", github.sniffercraft34.foodopolis.item.VanillaIceCreamItem::new);
/*  93 */   public static final DeferredHolder<Item, Item> STRAWBERRY = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry", github.sniffercraft34.foodopolis.item.StrawberryItem::new);
/*  94 */   public static final DeferredHolder<Item, Item> STRAWBERRYICECREAM = (DeferredHolder<Item, Item>)REGISTRY.register("strawberryicecream", github.sniffercraft34.foodopolis.item.StrawberryicecreamItem::new);
/*  95 */   public static final DeferredHolder<Item, Item> STRAWBERRY_JUICE = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry_juice", github.sniffercraft34.foodopolis.item.StrawberryJuiceItem::new);
/*  96 */   public static final DeferredHolder<Item, Item> CHOCOLATE = (DeferredHolder<Item, Item>)REGISTRY.register("chocolate", github.sniffercraft34.foodopolis.item.ChocolateItem::new);
/*  97 */   public static final DeferredHolder<Item, Item> WHITE_CHOCOLATE = (DeferredHolder<Item, Item>)REGISTRY.register("white_chocolate", github.sniffercraft34.foodopolis.item.WhiteChocolateItem::new);
/*  98 */   public static final DeferredHolder<Item, Item> CHIP = (DeferredHolder<Item, Item>)REGISTRY.register("chip", github.sniffercraft34.foodopolis.item.ChipItem::new);
/*  99 */   public static final DeferredHolder<Item, Item> BATTER = (DeferredHolder<Item, Item>)REGISTRY.register("batter", github.sniffercraft34.foodopolis.item.BatterItem::new);
/* 100 */   public static final DeferredHolder<Item, Item> BOX = (DeferredHolder<Item, Item>)REGISTRY.register("box", github.sniffercraft34.foodopolis.item.BoxItem::new);
/* 101 */   public static final DeferredHolder<Item, Item> FISHAND_CHIPS = (DeferredHolder<Item, Item>)REGISTRY.register("fishand_chips", github.sniffercraft34.foodopolis.item.FishandChipsItem::new);
/* 102 */   public static final DeferredHolder<Item, Item> SUGAR_CUBE = (DeferredHolder<Item, Item>)REGISTRY.register("sugar_cube", github.sniffercraft34.foodopolis.item.SugarCubeItem::new);
/* 103 */   public static final DeferredHolder<Item, Item> MARSHMALLOW = (DeferredHolder<Item, Item>)REGISTRY.register("marshmallow", github.sniffercraft34.foodopolis.item.MarshmallowItem::new);
/* 104 */   public static final DeferredHolder<Item, Item> FRIED_EGG = (DeferredHolder<Item, Item>)REGISTRY.register("fried_egg", github.sniffercraft34.foodopolis.item.FriedEggItem::new);
/* 105 */   public static final DeferredHolder<Item, Item> CHEESE = (DeferredHolder<Item, Item>)REGISTRY.register("cheese", github.sniffercraft34.foodopolis.item.CheeseItem::new);
/* 106 */   public static final DeferredHolder<Item, Item> CHEESE_SANDWICH = (DeferredHolder<Item, Item>)REGISTRY.register("cheese_sandwich", github.sniffercraft34.foodopolis.item.CheeseSandwichItem::new);
/* 107 */   public static final DeferredHolder<Item, Item> HAM = (DeferredHolder<Item, Item>)REGISTRY.register("ham", github.sniffercraft34.foodopolis.item.HamItem::new);
/* 108 */   public static final DeferredHolder<Item, Item> HAM_SANDWICH = (DeferredHolder<Item, Item>)REGISTRY.register("ham_sandwich", github.sniffercraft34.foodopolis.item.HamSandwichItem::new);
/* 109 */   public static final DeferredHolder<Item, Item> CHOCOLATE_ICE_CREAM = (DeferredHolder<Item, Item>)REGISTRY.register("chocolate_ice_cream", github.sniffercraft34.foodopolis.item.ChocolateIceCreamItem::new);
/* 110 */   public static final DeferredHolder<Item, Item> TOMATO = (DeferredHolder<Item, Item>)REGISTRY.register("tomato", github.sniffercraft34.foodopolis.item.TomatoItem::new);
/* 111 */   public static final DeferredHolder<Item, Item> PIZZA = (DeferredHolder<Item, Item>)REGISTRY.register("pizza", github.sniffercraft34.foodopolis.item.PizzaItem::new);
/* 112 */   public static final DeferredHolder<Item, Item> PEPPERONI = (DeferredHolder<Item, Item>)REGISTRY.register("pepperoni", github.sniffercraft34.foodopolis.item.PepperoniItem::new);
/* 113 */   public static final DeferredHolder<Item, Item> SPICE = (DeferredHolder<Item, Item>)REGISTRY.register("spice", github.sniffercraft34.foodopolis.item.SpiceItem::new);
/* 114 */   public static final DeferredHolder<Item, Item> CARAMEL = (DeferredHolder<Item, Item>)REGISTRY.register("caramel", github.sniffercraft34.foodopolis.item.CaramelItem::new);
/* 115 */   public static final DeferredHolder<Item, Item> BISCUIT = (DeferredHolder<Item, Item>)REGISTRY.register("biscuit", github.sniffercraft34.foodopolis.item.BiscuitItem::new);
/* 116 */   public static final DeferredHolder<Item, Item> CHOCOLATE_BISCUIT = (DeferredHolder<Item, Item>)REGISTRY.register("chocolate_biscuit", github.sniffercraft34.foodopolis.item.ChocolateBiscuitItem::new);
/* 117 */   public static final DeferredHolder<Item, Item> PIZZA_SLICE = (DeferredHolder<Item, Item>)REGISTRY.register("pizza_slice", github.sniffercraft34.foodopolis.item.PizzaSliceItem::new);
/* 118 */   public static final DeferredHolder<Item, Item> BURGER = (DeferredHolder<Item, Item>)REGISTRY.register("burger", github.sniffercraft34.foodopolis.item.BurgerItem::new);
/* 119 */   public static final DeferredHolder<Item, Item> CHEESE_BURGER = (DeferredHolder<Item, Item>)REGISTRY.register("cheese_burger", github.sniffercraft34.foodopolis.item.CheeseBurgerItem::new);
/* 120 */   public static final DeferredHolder<Item, Item> PINEAPPLE = (DeferredHolder<Item, Item>)REGISTRY.register("pineapple", github.sniffercraft34.foodopolis.item.PineappleItem::new);
/* 121 */   public static final DeferredHolder<Item, Item> PINEAPPLE_RING = (DeferredHolder<Item, Item>)REGISTRY.register("pineapple_ring", github.sniffercraft34.foodopolis.item.PineappleRingItem::new);
/* 122 */   public static final DeferredHolder<Item, Item> CUPCAKE = (DeferredHolder<Item, Item>)REGISTRY.register("cupcake", github.sniffercraft34.foodopolis.item.CupcakeItem::new);
/* 123 */   public static final DeferredHolder<Item, Item> DONUT = (DeferredHolder<Item, Item>)REGISTRY.register("donut", github.sniffercraft34.foodopolis.item.DonutItem::new);
/* 124 */   public static final DeferredHolder<Item, Item> BANANA = (DeferredHolder<Item, Item>)REGISTRY.register("banana", github.sniffercraft34.foodopolis.item.BananaItem::new);
/* 125 */   public static final DeferredHolder<Item, Item> FRENCH_FRIES = (DeferredHolder<Item, Item>)REGISTRY.register("french_fries", github.sniffercraft34.foodopolis.item.FrenchFriesItem::new);
/* 126 */   public static final DeferredHolder<Item, Item> STRAWBERRY_LOLLIEPOP = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry_lolliepop", github.sniffercraft34.foodopolis.item.StrawberryLolliepopItem::new);
/* 127 */   public static final DeferredHolder<Item, Item> LEMON = (DeferredHolder<Item, Item>)REGISTRY.register("lemon", github.sniffercraft34.foodopolis.item.LemonItem::new);
/* 128 */   public static final DeferredHolder<Item, Item> STRAWBERRY_ICE_LOLLY = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry_ice_lolly", github.sniffercraft34.foodopolis.item.StrawberryIceLollyItem::new);
/* 129 */   public static final DeferredHolder<Item, Item> LEMON_LOLLIEPOP = (DeferredHolder<Item, Item>)REGISTRY.register("lemon_lolliepop", github.sniffercraft34.foodopolis.item.LemonLolliepopItem::new);
/* 130 */   public static final DeferredHolder<Item, Item> LEMONADE_ICE_LOLLY = (DeferredHolder<Item, Item>)REGISTRY.register("lemonade_ice_lolly", github.sniffercraft34.foodopolis.item.LemonadeIceLollyItem::new);
/* 131 */   public static final DeferredHolder<Item, Item> RICE = (DeferredHolder<Item, Item>)REGISTRY.register("rice", github.sniffercraft34.foodopolis.item.RiceItem::new);
/* 132 */   public static final DeferredHolder<Item, Item> SUSHI = (DeferredHolder<Item, Item>)REGISTRY.register("sushi", github.sniffercraft34.foodopolis.item.SushiItem::new);
/* 133 */   public static final DeferredHolder<Item, Item> CROISSANT = (DeferredHolder<Item, Item>)REGISTRY.register("croissant", github.sniffercraft34.foodopolis.item.CroissantItem::new);
/* 134 */   public static final DeferredHolder<Item, Item> PAIN_AU_CHOCOLAT = (DeferredHolder<Item, Item>)REGISTRY.register("pain_au_chocolat", github.sniffercraft34.foodopolis.item.PainAuChocolatItem::new);
/* 135 */   public static final DeferredHolder<Item, Item> JAR = (DeferredHolder<Item, Item>)REGISTRY.register("jar", github.sniffercraft34.foodopolis.item.JarItem::new);
/* 136 */   public static final DeferredHolder<Item, Item> STRAWBERRY_JAM = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry_jam", github.sniffercraft34.foodopolis.item.StrawberryJamItem::new);
/* 137 */   public static final DeferredHolder<Item, Item> LEMON_CURD = (DeferredHolder<Item, Item>)REGISTRY.register("lemon_curd", github.sniffercraft34.foodopolis.item.LemonCurdItem::new);
/* 138 */   public static final DeferredHolder<Item, Item> ORANGE_MARMALADE = (DeferredHolder<Item, Item>)REGISTRY.register("orange_marmalade", github.sniffercraft34.foodopolis.item.OrangeMarmaladeItem::new);
/* 139 */   public static final DeferredHolder<Item, Item> CHICKEN_NUGGETS = (DeferredHolder<Item, Item>)REGISTRY.register("chicken_nuggets", github.sniffercraft34.foodopolis.item.ChickenNuggetsItem::new);
/* 140 */   public static final DeferredHolder<Item, Item> TOAST = (DeferredHolder<Item, Item>)REGISTRY.register("toast", github.sniffercraft34.foodopolis.item.ToastItem::new);
/* 141 */   public static final DeferredHolder<Item, Item> BUTTER = (DeferredHolder<Item, Item>)REGISTRY.register("butter", github.sniffercraft34.foodopolis.item.ButterItem::new);
/* 142 */   public static final DeferredHolder<Item, Item> STRAWBERRY_JAM_ON_TOAST = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry_jam_on_toast", github.sniffercraft34.foodopolis.item.StrawberryJamOnToastItem::new);
/* 143 */   public static final DeferredHolder<Item, Item> LEMON_CURD_ON_TOAST = (DeferredHolder<Item, Item>)REGISTRY.register("lemon_curd_on_toast", github.sniffercraft34.foodopolis.item.LemonCurdOnToastItem::new);
/* 144 */   public static final DeferredHolder<Item, Item> ORANGE_MARMALADE_ON_TOAST = (DeferredHolder<Item, Item>)REGISTRY.register("orange_marmalade_on_toast", github.sniffercraft34.foodopolis.item.OrangeMarmaladeOnToastItem::new);
/* 145 */   public static final DeferredHolder<Item, Item> HOT_CHOCOLATE = (DeferredHolder<Item, Item>)REGISTRY.register("hot_chocolate", github.sniffercraft34.foodopolis.item.HotChocolateItem::new);
/* 146 */   public static final DeferredHolder<Item, Item> WHITE_HOT_CHOCOLATE = (DeferredHolder<Item, Item>)REGISTRY.register("white_hot_chocolate", github.sniffercraft34.foodopolis.item.WhiteHotChocolateItem::new);
/* 147 */   public static final DeferredHolder<Item, Item> LEMONADE = (DeferredHolder<Item, Item>)REGISTRY.register("lemonade", github.sniffercraft34.foodopolis.item.LemonadeItem::new);
/* 148 */   public static final DeferredHolder<Item, Item> CORN = (DeferredHolder<Item, Item>)REGISTRY.register("corn", github.sniffercraft34.foodopolis.item.CornItem::new);
/* 149 */   public static final DeferredHolder<Item, Item> POPCORN = (DeferredHolder<Item, Item>)REGISTRY.register("popcorn", github.sniffercraft34.foodopolis.item.PopcornItem::new);
/* 150 */   public static final DeferredHolder<Item, Item> VANILLA_MILKSHAKE = (DeferredHolder<Item, Item>)REGISTRY.register("vanilla_milkshake", github.sniffercraft34.foodopolis.item.VanillaMilkshakeItem::new);
/* 151 */   public static final DeferredHolder<Item, Item> STRAWBERRY_MILKSHAKE = (DeferredHolder<Item, Item>)REGISTRY.register("strawberry_milkshake", github.sniffercraft34.foodopolis.item.StrawberryMilkshakeItem::new);
/* 152 */   public static final DeferredHolder<Item, Item> CHOCOLATE_MILKSHAKE = (DeferredHolder<Item, Item>)REGISTRY.register("chocolate_milkshake", github.sniffercraft34.foodopolis.item.ChocolateMilkshakeItem::new);
/* 153 */   public static final DeferredHolder<Item, Item> PASTA = (DeferredHolder<Item, Item>)REGISTRY.register("pasta", github.sniffercraft34.foodopolis.item.PastaItem::new);
/* 154 */   public static final DeferredHolder<Item, Item> MAC_AND_CHEESE = (DeferredHolder<Item, Item>)REGISTRY.register("mac_and_cheese", github.sniffercraft34.foodopolis.item.MacAndCheeseItem::new);
/* 155 */   public static final DeferredHolder<Item, Item> LASAGNA = (DeferredHolder<Item, Item>)REGISTRY.register("lasagna", github.sniffercraft34.foodopolis.item.LasagnaItem::new);
/*     */ }


