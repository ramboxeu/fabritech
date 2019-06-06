package eu.rambox.factorization.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class RhodiumOreBlock extends FactorizationBlock {

    public RhodiumOreBlock() {
        super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).build());
        FactorizationBlocks.BLOCKS.add(this);
    }

    @Override
    public String getBlockName() {
        return "rhodium_ore";
    }
}
