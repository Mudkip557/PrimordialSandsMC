
package net.mcreator.primordialsands.block;

@ElementsPrimordialSands.ModElement.Tag
public class BlockIndengrass extends ElementsPrimordialSands.ModElement {

	@GameRegistry.ObjectHolder("primordialsands:indengrass")
	public static final Block block = null;

	public BlockIndengrass(ElementsPrimordialSands instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("indengrass"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("primordialsands:indengrass", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.GRASS);

			setUnlocalizedName("indengrass");
			setSoundType(SoundType.GROUND);

			setHarvestLevel("shovel", 1);

			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabPrioMaterialTab.tab);

		}

	}

}
