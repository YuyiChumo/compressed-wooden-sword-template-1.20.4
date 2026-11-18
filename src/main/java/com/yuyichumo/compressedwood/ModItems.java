package com.yuyichumo.compressedwood;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // 命名空间必须与 fabric.mod.json 里的 mod id 完全一致，且只能用小写字母
    public static final String MOD_ID = "compressed-wooden-sword";

    // 参数：基础材质(木)、伤害(3)、攻击速度(-2.4)、物品设置
    public static final Item COMPRESSED_WOODEN_SWORD = new SwordItem(
            ToolMaterials.WOOD,
            99,
            -2.4f,
            new Item.Settings()
    );

    public static final Item SINGLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item DOUBLE_COMPRESSED_STICK = new Item(new Item.Settings());
    public static final Item Triple_COMPRESSED_STICK = new Item(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "compressed_wooden_sword"), COMPRESSED_WOODEN_SWORD);

        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "single_compressed_stick"), SINGLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "double_compressed_stick"), DOUBLE_COMPRESSED_STICK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "double_compressed_stick"), Triple_COMPRESSED_STICK);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COMPRESSED_WOODEN_SWORD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(SINGLE_COMPRESSED_STICK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(DOUBLE_COMPRESSED_STICK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(Triple_COMPRESSED_STICK);
        });
    }
}