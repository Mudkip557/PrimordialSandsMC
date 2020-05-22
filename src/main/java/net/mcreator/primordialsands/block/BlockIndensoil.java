
package net.mcreator.primordialsands.block;

@ElementsPrimordialSands.ModElement.Tag
public class BlockIndensoil extends ElementsPrimordialSands.ModElement {

	@GameRegistry.ObjectHolder("primordialsands:indensoil")
	public static final Block block = null;

	public BlockIndensoil(ElementsPrimordialSands instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("indensoil"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("primordialsands:indensoil", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.GROUND);

			setUnlocalizedName("indensoil");
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
