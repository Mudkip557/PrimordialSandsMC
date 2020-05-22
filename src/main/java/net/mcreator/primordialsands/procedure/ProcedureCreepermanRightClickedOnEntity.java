package net.mcreator.primordialsands.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.primordialsands.ElementsPrimordialSands;

@ElementsPrimordialSands.ModElement.Tag
public class ProcedureCreepermanRightClickedOnEntity extends ElementsPrimordialSands.ModElement {
	public ProcedureCreepermanRightClickedOnEntity(ElementsPrimordialSands instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CreepermanRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CreepermanRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CreepermanRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CreepermanRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CreepermanRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double dupe = 0;
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, (int) 20, 3, 3, 3, 1, new int[0]);
		entity.getEntityData().setString("Dupe:", "1");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
	}
}
