package eu.rambox.factorization.block;


import net.minecraft.block.Block;

public abstract class FactorizationBlock extends Block {
    public abstract String getName();

    public FactorizationBlock(Settings settings) {
        super(settings);
    }
}
