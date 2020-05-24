package net.mcreator.primordialsands.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.primordialsands.ElementsPrimordialSands;

@ElementsPrimordialSands.ModElement.Tag
public class ProcedureRubyroseBulletHitssap extends ElementsPrimordialSands.ModElement {
	public ProcedureRubyroseBulletHitssap(ElementsPrimordialSands instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RubyroseBulletHitssap!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RubyroseBulletHitssap!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RubyroseBulletHitssap!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RubyroseBulletHitssap!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
	}
}
