package net.dranoel.technology.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WireBlock extends Block {
	public WireBlock() {
		super(FabricBlockSettings.of(Material.METAL));
	}
	
	@Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		VoxelShape vertical = VoxelShapes.cuboid(0.4375f, 0f, 0.4375f, 0.5625f, 1f, 0.5625f);
		VoxelShape northSouth = VoxelShapes.cuboid(0.4375f, 0.4375f, 0f, 0.5625f, 0.5625f, 1f);
		VoxelShape eastWest = VoxelShapes.cuboid(0f, 0.4375f, 0.4375f, 1f, 0.5625f, 0.5625f);
        return VoxelShapes.union(vertical, northSouth, eastWest);
    }
}
