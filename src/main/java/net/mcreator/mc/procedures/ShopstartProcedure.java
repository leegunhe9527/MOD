package net.mcreator.mc.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mc.McMod;

import java.util.function.Supplier;
import java.util.Map;

public class ShopstartProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double dd = 0;
		dd = 1;
		for (int index0 = 0; index0 < (int) (64); index0++) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
					_setstack.setCount((int) dd);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				McMod.LOGGER.info(" There are no stones. Fill the stones!");
				break;
			}
			dd = dd + 1;
		}
	}
}
