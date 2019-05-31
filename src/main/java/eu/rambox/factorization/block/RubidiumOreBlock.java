package eu.rambox.factorization.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class RubidiumOreBlock extends FactorizationBlock {

    public RubidiumOreBlock() {
        super(FabricBlockSettings.of(Material.STONE).breakByTool(null, 3).build());
        FactorizationBlocks.BLOCKS.add(this);
    }

    @Override
    public String getName() {
        return "rubidiumore";
    }
}
