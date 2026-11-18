package com.yuyichumo.compressedwood;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    // 命名空间必须与 fabric.mod.json 里的 mod id 完全一致，且只能用小写字母
    public static final String MOD_ID = "compressed-wooden-sword";

    public static final RegistryKey<ItemGroup> COMPRESSED_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "compressed_group"));

    // 参数：基础材质(木)、伤害(3)、攻击速度(-2.4)、物品设置
    public static final Item COMPRESSED_WOODEN_SWORD = new SwordItem(
            ToolMaterials.WOOD,
            99,
            -2.4f,
            new Item.Settings()
    );

    public static final Item SINGLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item DOUBLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item TRIPLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item QUADRUPLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item FIFTH_ORDER_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item SIXTH_ORDER_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item SEVENTH_ORDER_SINGLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item EIGHTH_ORDER_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item NINTH_ORDER_COMPRESSED_STICK = new Item(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "compressed_wooden_sword"), COMPRESSED_WOODEN_SWORD);

        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "single_compressed_stick"), SINGLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "double_compressed_stick"), DOUBLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "triple_compressed_stick"), TRIPLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "quadruple_compressed_stick"), QUADRUPLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "fifth_order_compressed_stick"), FIFTH_ORDER_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "sixth_order_compressed_stick"), SIXTH_ORDER_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "seventh_order_compressed_stick"), SEVENTH_ORDER_SINGLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eighth_order_compressed_stick"), EIGHTH_ORDER_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ninth_order_compressed_stick"), NINTH_ORDER_COMPRESSED_STICK);

        // 2. 注册这个标签页
        Registry.register(Registries.ITEM_GROUP, COMPRESSED_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(COMPRESSED_WOODEN_SWORD)) // 标签页的图标（这里用你的木剑）
                .displayName(Text.translatable("itemGroup.compressed-wooden-sword.compressed_group")) // 标签页的名字，后面配翻译
                .build()
        );

        // 3. 把物品加进这个新标签页里
        ItemGroupEvents.modifyEntriesEvent(COMPRESSED_GROUP).register(content -> {
            content.add(COMPRESSED_WOODEN_SWORD);
            content.add(SINGLE_COMPRESSED_STICK);
            content.add(DOUBLE_COMPRESSED_STICK);
            content.add(TRIPLE_COMPRESSED_STICK);
            content.add(QUADRUPLE_COMPRESSED_STICK);
            content.add(FIFTH_ORDER_COMPRESSED_STICK);
            content.add(SIXTH_ORDER_COMPRESSED_STICK);
            content.add(SEVENTH_ORDER_SINGLE_COMPRESSED_STICK);
            content.add(EIGHTH_ORDER_COMPRESSED_STICK);
            content.add(NINTH_ORDER_COMPRESSED_STICK);
        });
    }
}