package com.yuyichumo.compressedwood;

import net.fabricmc.api.ModInitializer;

public class CompressedWoodenSword implements ModInitializer {
	@Override
	public void onInitialize() {
		// 调用物品注册
		ModItems.registerItems();
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}