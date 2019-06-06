package eu.rambox.factorization.block;

import eu.rambox.factorization.Factorization;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.HashSet;

public class FactorizationBlocks {
    public static final HashSet<FactorizationBlock> BLOCKS = new HashSet<>();

    public static final Block RHODIUM_ORE = new RhodiumOreBlock();

    public static void register(){
        Factorization.LOGGER.info("Registering {} blocks", BLOCKS.size());

        for(FactorizationBlock block : BLOCKS){
            Registry.register(Registry.BLOCK, new Identifier(Factorization.MOD_ID, block.getBlockName()), block);
            Registry.register(Registry.ITEM, new Identifier(Factorization.MOD_ID, block.getBlockName()), new BlockItem(block, new Item.Settings().group(Factorization.ITEM_GROUP)));
        }
    }

    public static void addOres(){
        Factorization.LOGGER.info("Adding ores to world generation");

        for(Biome biome : Biome.BIOMES){
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(net.minecraft.world.gen.feature.Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, FactorizationBlocks.RHODIUM_ORE.getDefaultState(), 8), Decorator.COUNT_RANGE, new RangeDecoratorConfig(20, 0, 0, 64)));
        }
    }
}
