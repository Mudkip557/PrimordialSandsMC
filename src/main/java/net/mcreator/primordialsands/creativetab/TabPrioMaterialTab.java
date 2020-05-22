
package net.mcreator.primordialsands.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.primordialsands.item.ItemIndenwood;
import net.mcreator.primordialsands.ElementsPrimordialSands;

@ElementsPrimordialSands.ModElement.Tag
public class TabPrioMaterialTab extends ElementsPrimordialSands.ModElement {
	public TabPrioMaterialTab(ElementsPrimordialSands instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabpriomaterialtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIndenwood.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
