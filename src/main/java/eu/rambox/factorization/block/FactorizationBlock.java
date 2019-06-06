package eu.rambox.factorization.block;


import net.minecraft.block.Block;

public abstract class FactorizationBlock extends Block {
    public abstract String getBlockName();

    public FactorizationBlock(Settings settings) {
        super(settings);
    }
}
