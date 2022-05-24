package net.dranoel.technology.entrypoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.dranoel.technology.blocks.WireBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DranoelsTechnology implements ModInitializer {
	public static final String MODID = "dranoels_technology";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static Identifier identifier(String id) {
		return new Identifier(MODID, id);
	}

	public static ItemGroup GROUP;

	public static Block WIRE_BLOCK;
	public static Item WIRE_BLOCK_ITEM;
	@Override
	public void onInitialize() {
		GROUP = FabricItemGroupBuilder
				.build(identifier("item_group"), () -> new ItemStack(WIRE_BLOCK_ITEM));
		WIRE_BLOCK = Registry.register(Registry.BLOCK, identifier("wire"), new WireBlock());
		WIRE_BLOCK_ITEM = Registry.register(Registry.ITEM, identifier("wire"), new BlockItem(WIRE_BLOCK, new FabricItemSettings().group(GROUP)));
		LOGGER.info("Hello Fabric world!");
	}
}
