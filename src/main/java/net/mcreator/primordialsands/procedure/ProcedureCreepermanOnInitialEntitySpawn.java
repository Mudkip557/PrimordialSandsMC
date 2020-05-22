package net.mcreator.primordialsands.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.primordialsands.ElementsPrimordialSands;

@ElementsPrimordialSands.ModElement.Tag
public class ProcedureCreepermanOnInitialEntitySpawn extends ElementsPrimordialSands.ModElement {
	public ProcedureCreepermanOnInitialEntitySpawn(ElementsPrimordialSands instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CreepermanOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 3, (int) 255, (false), (false)));
	}
}
