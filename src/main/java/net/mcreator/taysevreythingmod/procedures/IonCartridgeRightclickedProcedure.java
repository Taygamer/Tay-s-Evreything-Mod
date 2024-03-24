package net.mcreator.taysevreythingmod.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

public class IonCartridgeRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSecondsOnFire(100);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, (int) 0.5);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 0, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
