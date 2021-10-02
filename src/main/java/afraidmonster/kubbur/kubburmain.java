package afraidmonster.kubbur;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kubburmain implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("kubbur");

	public static final Block KUBBUR_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));
	public static final Block ICEVM_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));
	public static final Block HEIMSNET_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));
	public static final Block AFRAID_LOGO = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));
	public static final Block AFRAID_LOGO_WHITE = new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0f));

	@Override
	public void onInitialize() {
		
		Registry.register(Registry.BLOCK, new Identifier("kubbur", "kubbur_block"), KUBBUR_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("kubbur", "kubbur_block"), new BlockItem(KUBBUR_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("kubbur", "icevm_block"), ICEVM_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("kubbur", "icevm_block"), new BlockItem(ICEVM_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("kubbur", "heimsnet_block"), HEIMSNET_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("kubbur", "heimsnet_block"), new BlockItem(HEIMSNET_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("kubbur", "afraid_logo"), AFRAID_LOGO);
		Registry.register(Registry.ITEM, new Identifier("kubbur", "afraid_logo"), new BlockItem(AFRAID_LOGO, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("kubbur", "afraid_logo_white"), AFRAID_LOGO_WHITE);
		Registry.register(Registry.ITEM, new Identifier("kubbur", "afraid_logo_white"), new BlockItem(AFRAID_LOGO_WHITE, new FabricItemSettings()));

		LOGGER.info("Fuck Paul Tracer");
	}
}

