package com.yuyichumo.compressedwood.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * 模板自带的示例 Mixin，方法体是空的。
 *
 * 注意：它目前没有写进 compressed-wooden-sword.mixins.json 的 mixins 列表。
 * 原因是在这套 yarn 映射下，注解处理器无法为 MinecraftServer#loadLevel 找到
 * 混淆映射（报错 "Unable to locate obfuscation mapping"），生成的 refmap 是空的，
 * 正式环境里注入会失败并导致进入世界时崩溃。
 * 等你真正需要写 Mixin 时，把要改的方法换成一个能正常映射的方法，再把类名加回
 * mixins 列表即可。
 */
@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadLevel")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadLevel()V
	}
}
