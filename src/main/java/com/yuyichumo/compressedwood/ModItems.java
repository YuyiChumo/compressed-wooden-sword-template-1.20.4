package 你的包名; // 保持和你主类一样的 package

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // 参数：基础材质(木)、伤害(3)、攻击速度(-2.4)、物品设置
    public static final Item COMPRESSED_WOODEN_SWORD = new SwordItem(
            ToolMaterials.WOOD,
            3,
            -2.4F,
            new Item.Settings()
    );

    // 写一个注册方法
    public static void registerItems() {
        // 把物品注册进游戏，ID 为 compressedwooden_sword
        Registry.register(Registries.ITEM, new Identifier("compressedwooden", "compressed_wooden_sword"), COMPRESSED_WOODEN_SWORD);

        // 把物品放进创造模式的“战斗”分类里
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COMPRESSED_WOODEN_SWORD);
        });
    }
}