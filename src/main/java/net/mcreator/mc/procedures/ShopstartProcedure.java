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
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
					_setstack.setCount(2);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
						_setstack.setCount(3);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
							.getItem() == Blocks.STONE.asItem()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
							_setstack.setCount(4);
							((Slot) _slots.get(1)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.STONE.asItem()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
								_setstack.setCount(5);
								((Slot) _slots.get(1)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).remove(1);
								_player.containerMenu.broadcastChanges();
							}
							if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
									.getItem() == Blocks.STONE.asItem()) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
									_setstack.setCount(6);
									((Slot) _slots.get(1)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(0)).remove(1);
									_player.containerMenu.broadcastChanges();
								}
								if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getItem() == Blocks.STONE.asItem()) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
										_setstack.setCount(7);
										((Slot) _slots.get(1)).set(_setstack);
										_player.containerMenu.broadcastChanges();
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(0)).remove(1);
										_player.containerMenu.broadcastChanges();
									}
									if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
											&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
											.getItem() == Blocks.STONE.asItem()) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
											_setstack.setCount(8);
											((Slot) _slots.get(1)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											((Slot) _slots.get(0)).remove(1);
											_player.containerMenu.broadcastChanges();
										}
										if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
												&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
												.getItem() == Blocks.STONE.asItem()) {
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
												_setstack.setCount(9);
												((Slot) _slots.get(1)).set(_setstack);
												_player.containerMenu.broadcastChanges();
											}
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												((Slot) _slots.get(0)).remove(1);
												_player.containerMenu.broadcastChanges();
											}
											if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
													&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
													.getItem() == Blocks.STONE.asItem()) {
												if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
														&& _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
													_setstack.setCount(10);
													((Slot) _slots.get(1)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
												if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
														&& _current.get() instanceof Map _slots) {
													((Slot) _slots.get(0)).remove(1);
													_player.containerMenu.broadcastChanges();
												}
												if ((entity instanceof ServerPlayer _plrSlotItem
														&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																? ((Slot) _slt.get(0)).getItem()
																: ItemStack.EMPTY)
														.getItem() == Blocks.STONE.asItem()) {
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
														_setstack.setCount(11);
														((Slot) _slots.get(1)).set(_setstack);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														((Slot) _slots.get(0)).remove(1);
														_player.containerMenu.broadcastChanges();
													}
													if ((entity instanceof ServerPlayer _plrSlotItem
															&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																	? ((Slot) _slt.get(0)).getItem()
																	: ItemStack.EMPTY)
															.getItem() == Blocks.STONE.asItem()) {
														if (entity instanceof ServerPlayer _player
																&& _player.containerMenu instanceof Supplier _current
																&& _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
															_setstack.setCount(12);
															((Slot) _slots.get(1)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof ServerPlayer _player
																&& _player.containerMenu instanceof Supplier _current
																&& _current.get() instanceof Map _slots) {
															((Slot) _slots.get(0)).remove(1);
															_player.containerMenu.broadcastChanges();
														}
														if ((entity instanceof ServerPlayer _plrSlotItem
																&& _plrSlotItem.containerMenu instanceof Supplier _splr
																&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																.getItem() == Blocks.STONE.asItem()) {
															if (entity instanceof ServerPlayer _player
																	&& _player.containerMenu instanceof Supplier _current
																	&& _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																_setstack.setCount(13);
																((Slot) _slots.get(1)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
															if (entity instanceof ServerPlayer _player
																	&& _player.containerMenu instanceof Supplier _current
																	&& _current.get() instanceof Map _slots) {
																((Slot) _slots.get(0)).remove(1);
																_player.containerMenu.broadcastChanges();
															}
															if ((entity instanceof ServerPlayer _plrSlotItem
																	&& _plrSlotItem.containerMenu instanceof Supplier _splr
																	&& _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(0)).getItem()
																			: ItemStack.EMPTY)
																	.getItem() == Blocks.STONE.asItem()) {
																if (entity instanceof ServerPlayer _player
																		&& _player.containerMenu instanceof Supplier _current
																		&& _current.get() instanceof Map _slots) {
																	ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																	_setstack.setCount(14);
																	((Slot) _slots.get(1)).set(_setstack);
																	_player.containerMenu.broadcastChanges();
																}
																if (entity instanceof ServerPlayer _player
																		&& _player.containerMenu instanceof Supplier _current
																		&& _current.get() instanceof Map _slots) {
																	((Slot) _slots.get(0)).remove(1);
																	_player.containerMenu.broadcastChanges();
																}
																if ((entity instanceof ServerPlayer _plrSlotItem
																		&& _plrSlotItem.containerMenu instanceof Supplier _splr
																		&& _splr.get() instanceof Map _slt
																				? ((Slot) _slt.get(0)).getItem()
																				: ItemStack.EMPTY)
																		.getItem() == Blocks.STONE.asItem()) {
																	if (entity instanceof ServerPlayer _player
																			&& _player.containerMenu instanceof Supplier _current
																			&& _current.get() instanceof Map _slots) {
																		ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																		_setstack.setCount(15);
																		((Slot) _slots.get(1)).set(_setstack);
																		_player.containerMenu.broadcastChanges();
																	}
																	if (entity instanceof ServerPlayer _player
																			&& _player.containerMenu instanceof Supplier _current
																			&& _current.get() instanceof Map _slots) {
																		((Slot) _slots.get(0)).remove(1);
																		_player.containerMenu.broadcastChanges();
																	}
																	if ((entity instanceof ServerPlayer _plrSlotItem
																			&& _plrSlotItem.containerMenu instanceof Supplier _splr
																			&& _splr.get() instanceof Map _slt
																					? ((Slot) _slt.get(0)).getItem()
																					: ItemStack.EMPTY)
																			.getItem() == Blocks.STONE.asItem()) {
																		if (entity instanceof ServerPlayer _player
																				&& _player.containerMenu instanceof Supplier _current
																				&& _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																			_setstack.setCount(16);
																			((Slot) _slots.get(1)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																		if (entity instanceof ServerPlayer _player
																				&& _player.containerMenu instanceof Supplier _current
																				&& _current.get() instanceof Map _slots) {
																			((Slot) _slots.get(0)).remove(1);
																			_player.containerMenu.broadcastChanges();
																		}
																		if ((entity instanceof ServerPlayer _plrSlotItem
																				&& _plrSlotItem.containerMenu instanceof Supplier _splr
																				&& _splr.get() instanceof Map _slt
																						? ((Slot) _slt.get(0)).getItem()
																						: ItemStack.EMPTY)
																				.getItem() == Blocks.STONE.asItem()) {
																			if (entity instanceof ServerPlayer _player
																					&& _player.containerMenu instanceof Supplier _current
																					&& _current.get() instanceof Map _slots) {
																				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																				_setstack.setCount(17);
																				((Slot) _slots.get(1)).set(_setstack);
																				_player.containerMenu.broadcastChanges();
																			}
																			if (entity instanceof ServerPlayer _player
																					&& _player.containerMenu instanceof Supplier _current
																					&& _current.get() instanceof Map _slots) {
																				((Slot) _slots.get(0)).remove(1);
																				_player.containerMenu.broadcastChanges();
																			}
																			if ((entity instanceof ServerPlayer _plrSlotItem
																					&& _plrSlotItem.containerMenu instanceof Supplier _splr
																					&& _splr.get() instanceof Map _slt
																							? ((Slot) _slt.get(0)).getItem()
																							: ItemStack.EMPTY)
																					.getItem() == Blocks.STONE.asItem()) {
																				if (entity instanceof ServerPlayer _player
																						&& _player.containerMenu instanceof Supplier _current
																						&& _current.get() instanceof Map _slots) {
																					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																					_setstack.setCount(18);
																					((Slot) _slots.get(1)).set(_setstack);
																					_player.containerMenu.broadcastChanges();
																				}
																				if (entity instanceof ServerPlayer _player
																						&& _player.containerMenu instanceof Supplier _current
																						&& _current.get() instanceof Map _slots) {
																					((Slot) _slots.get(0)).remove(1);
																					_player.containerMenu.broadcastChanges();
																				}
																				if ((entity instanceof ServerPlayer _plrSlotItem
																						&& _plrSlotItem.containerMenu instanceof Supplier _splr
																						&& _splr.get() instanceof Map _slt
																								? ((Slot) _slt.get(0)).getItem()
																								: ItemStack.EMPTY)
																						.getItem() == Blocks.STONE.asItem()) {
																					if (entity instanceof ServerPlayer _player
																							&& _player.containerMenu instanceof Supplier _current
																							&& _current.get() instanceof Map _slots) {
																						ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																						_setstack.setCount(19);
																						((Slot) _slots.get(1)).set(_setstack);
																						_player.containerMenu.broadcastChanges();
																					}
																					if (entity instanceof ServerPlayer _player
																							&& _player.containerMenu instanceof Supplier _current
																							&& _current.get() instanceof Map _slots) {
																						((Slot) _slots.get(0)).remove(1);
																						_player.containerMenu.broadcastChanges();
																					}
																					if ((entity instanceof ServerPlayer _plrSlotItem
																							&& _plrSlotItem.containerMenu instanceof Supplier _splr
																							&& _splr.get() instanceof Map _slt
																									? ((Slot) _slt.get(0)).getItem()
																									: ItemStack.EMPTY)
																							.getItem() == Blocks.STONE.asItem()) {
																						if (entity instanceof ServerPlayer _player
																								&& _player.containerMenu instanceof Supplier _current
																								&& _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
																							_setstack.setCount(20);
																							((Slot) _slots.get(1)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																						if (entity instanceof ServerPlayer _player
																								&& _player.containerMenu instanceof Supplier _current
																								&& _current.get() instanceof Map _slots) {
																							((Slot) _slots.get(0)).remove(1);
																							_player.containerMenu.broadcastChanges();
																						}
																						if ((entity instanceof ServerPlayer _plrSlotItem
																								&& _plrSlotItem.containerMenu instanceof Supplier _splr
																								&& _splr.get() instanceof Map _slt
																										? ((Slot) _slt.get(0)).getItem()
																										: ItemStack.EMPTY)
																								.getItem() == Blocks.STONE.asItem()) {
																							if (entity instanceof ServerPlayer _player
																									&& _player.containerMenu instanceof Supplier _current
																									&& _current.get() instanceof Map _slots) {
																								ItemStack _setstack = new ItemStack(
																										Blocks.DIAMOND_ORE);
																								_setstack.setCount(21);
																								((Slot) _slots.get(1)).set(_setstack);
																								_player.containerMenu.broadcastChanges();
																							}
																							if (entity instanceof ServerPlayer _player
																									&& _player.containerMenu instanceof Supplier _current
																									&& _current.get() instanceof Map _slots) {
																								((Slot) _slots.get(0)).remove(1);
																								_player.containerMenu.broadcastChanges();
																							}
																							if ((entity instanceof ServerPlayer _plrSlotItem
																									&& _plrSlotItem.containerMenu instanceof Supplier _splr
																									&& _splr.get() instanceof Map _slt
																											? ((Slot) _slt.get(0)).getItem()
																											: ItemStack.EMPTY)
																									.getItem() == Blocks.STONE.asItem()) {
																								if (entity instanceof ServerPlayer _player
																										&& _player.containerMenu instanceof Supplier _current
																										&& _current.get() instanceof Map _slots) {
																									ItemStack _setstack = new ItemStack(
																											Blocks.DIAMOND_ORE);
																									_setstack.setCount(22);
																									((Slot) _slots.get(1)).set(_setstack);
																									_player.containerMenu.broadcastChanges();
																								}
																								if (entity instanceof ServerPlayer _player
																										&& _player.containerMenu instanceof Supplier _current
																										&& _current.get() instanceof Map _slots) {
																									((Slot) _slots.get(0)).remove(1);
																									_player.containerMenu.broadcastChanges();
																								}
																								if ((entity instanceof ServerPlayer _plrSlotItem
																										&& _plrSlotItem.containerMenu instanceof Supplier _splr
																										&& _splr.get() instanceof Map _slt
																												? ((Slot) _slt.get(0)).getItem()
																												: ItemStack.EMPTY)
																										.getItem() == Blocks.STONE.asItem()) {
																									if (entity instanceof ServerPlayer _player
																											&& _player.containerMenu instanceof Supplier _current
																											&& _current.get() instanceof Map _slots) {
																										ItemStack _setstack = new ItemStack(
																												Blocks.DIAMOND_ORE);
																										_setstack.setCount(23);
																										((Slot) _slots.get(1)).set(_setstack);
																										_player.containerMenu.broadcastChanges();
																									}
																									if (entity instanceof ServerPlayer _player
																											&& _player.containerMenu instanceof Supplier _current
																											&& _current.get() instanceof Map _slots) {
																										((Slot) _slots.get(0)).remove(1);
																										_player.containerMenu.broadcastChanges();
																									}
																									if ((entity instanceof ServerPlayer _plrSlotItem
																											&& _plrSlotItem.containerMenu instanceof Supplier _splr
																											&& _splr.get() instanceof Map _slt
																													? ((Slot) _slt.get(0)).getItem()
																													: ItemStack.EMPTY)
																											.getItem() == Blocks.STONE.asItem()) {
																										if (entity instanceof ServerPlayer _player
																												&& _player.containerMenu instanceof Supplier _current
																												&& _current
																														.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(
																													Blocks.DIAMOND_ORE);
																											_setstack.setCount(24);
																											((Slot) _slots.get(1)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																										if (entity instanceof ServerPlayer _player
																												&& _player.containerMenu instanceof Supplier _current
																												&& _current
																														.get() instanceof Map _slots) {
																											((Slot) _slots.get(0)).remove(1);
																											_player.containerMenu.broadcastChanges();
																										}
																										if ((entity instanceof ServerPlayer _plrSlotItem
																												&& _plrSlotItem.containerMenu instanceof Supplier _splr
																												&& _splr.get() instanceof Map _slt
																														? ((Slot) _slt.get(0))
																																.getItem()
																														: ItemStack.EMPTY)
																												.getItem() == Blocks.STONE.asItem()) {
																											if (entity instanceof ServerPlayer _player
																													&& _player.containerMenu instanceof Supplier _current
																													&& _current
																															.get() instanceof Map _slots) {
																												ItemStack _setstack = new ItemStack(
																														Blocks.DIAMOND_ORE);
																												_setstack.setCount(25);
																												((Slot) _slots.get(1)).set(_setstack);
																												_player.containerMenu
																														.broadcastChanges();
																											}
																											if (entity instanceof ServerPlayer _player
																													&& _player.containerMenu instanceof Supplier _current
																													&& _current
																															.get() instanceof Map _slots) {
																												((Slot) _slots.get(0)).remove(1);
																												_player.containerMenu
																														.broadcastChanges();
																											}
																											if ((entity instanceof ServerPlayer _plrSlotItem
																													&& _plrSlotItem.containerMenu instanceof Supplier _splr
																													&& _splr.get() instanceof Map _slt
																															? ((Slot) _slt.get(0))
																																	.getItem()
																															: ItemStack.EMPTY)
																													.getItem() == Blocks.STONE
																															.asItem()) {
																												if (entity instanceof ServerPlayer _player
																														&& _player.containerMenu instanceof Supplier _current
																														&& _current
																																.get() instanceof Map _slots) {
																													ItemStack _setstack = new ItemStack(
																															Blocks.DIAMOND_ORE);
																													_setstack.setCount(26);
																													((Slot) _slots.get(1))
																															.set(_setstack);
																													_player.containerMenu
																															.broadcastChanges();
																												}
																												if (entity instanceof ServerPlayer _player
																														&& _player.containerMenu instanceof Supplier _current
																														&& _current
																																.get() instanceof Map _slots) {
																													((Slot) _slots.get(0)).remove(1);
																													_player.containerMenu
																															.broadcastChanges();
																												}
																												if ((entity instanceof ServerPlayer _plrSlotItem
																														&& _plrSlotItem.containerMenu instanceof Supplier _splr
																														&& _splr.get() instanceof Map _slt
																																? ((Slot) _slt.get(0))
																																		.getItem()
																																: ItemStack.EMPTY)
																														.getItem() == Blocks.STONE
																																.asItem()) {
																													if (entity instanceof ServerPlayer _player
																															&& _player.containerMenu instanceof Supplier _current
																															&& _current
																																	.get() instanceof Map _slots) {
																														ItemStack _setstack = new ItemStack(
																																Blocks.DIAMOND_ORE);
																														_setstack.setCount(27);
																														((Slot) _slots.get(1))
																																.set(_setstack);
																														_player.containerMenu
																																.broadcastChanges();
																													}
																													if (entity instanceof ServerPlayer _player
																															&& _player.containerMenu instanceof Supplier _current
																															&& _current
																																	.get() instanceof Map _slots) {
																														((Slot) _slots.get(0))
																																.remove(1);
																														_player.containerMenu
																																.broadcastChanges();
																													}
																													if ((entity instanceof ServerPlayer _plrSlotItem
																															&& _plrSlotItem.containerMenu instanceof Supplier _splr
																															&& _splr.get() instanceof Map _slt
																																	? ((Slot) _slt
																																			.get(0))
																																			.getItem()
																																	: ItemStack.EMPTY)
																															.getItem() == Blocks.STONE
																																	.asItem()) {
																														if (entity instanceof ServerPlayer _player
																																&& _player.containerMenu instanceof Supplier _current
																																&& _current
																																		.get() instanceof Map _slots) {
																															ItemStack _setstack = new ItemStack(
																																	Blocks.DIAMOND_ORE);
																															_setstack.setCount(28);
																															((Slot) _slots.get(1))
																																	.set(_setstack);
																															_player.containerMenu
																																	.broadcastChanges();
																														}
																														if (entity instanceof ServerPlayer _player
																																&& _player.containerMenu instanceof Supplier _current
																																&& _current
																																		.get() instanceof Map _slots) {
																															((Slot) _slots.get(0))
																																	.remove(1);
																															_player.containerMenu
																																	.broadcastChanges();
																														}
																														if ((entity instanceof ServerPlayer _plrSlotItem
																																&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																&& _splr.get() instanceof Map _slt
																																		? ((Slot) _slt
																																				.get(0))
																																				.getItem()
																																		: ItemStack.EMPTY)
																																.getItem() == Blocks.STONE
																																		.asItem()) {
																															if (entity instanceof ServerPlayer _player
																																	&& _player.containerMenu instanceof Supplier _current
																																	&& _current
																																			.get() instanceof Map _slots) {
																																ItemStack _setstack = new ItemStack(
																																		Blocks.DIAMOND_ORE);
																																_setstack
																																		.setCount(29);
																																((Slot) _slots.get(1))
																																		.set(_setstack);
																																_player.containerMenu
																																		.broadcastChanges();
																															}
																															if (entity instanceof ServerPlayer _player
																																	&& _player.containerMenu instanceof Supplier _current
																																	&& _current
																																			.get() instanceof Map _slots) {
																																((Slot) _slots.get(0))
																																		.remove(1);
																																_player.containerMenu
																																		.broadcastChanges();
																															}
																															if ((entity instanceof ServerPlayer _plrSlotItem
																																	&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																	&& _splr.get() instanceof Map _slt
																																			? ((Slot) _slt
																																					.get(0))
																																					.getItem()
																																			: ItemStack.EMPTY)
																																	.getItem() == Blocks.STONE
																																			.asItem()) {
																																if (entity instanceof ServerPlayer _player
																																		&& _player.containerMenu instanceof Supplier _current
																																		&& _current
																																				.get() instanceof Map _slots) {
																																	ItemStack _setstack = new ItemStack(
																																			Blocks.DIAMOND_ORE);
																																	_setstack
																																			.setCount(
																																					30);
																																	((Slot) _slots
																																			.get(1))
																																			.set(_setstack);
																																	_player.containerMenu
																																			.broadcastChanges();
																																}
																																if (entity instanceof ServerPlayer _player
																																		&& _player.containerMenu instanceof Supplier _current
																																		&& _current
																																				.get() instanceof Map _slots) {
																																	((Slot) _slots
																																			.get(0))
																																			.remove(1);
																																	_player.containerMenu
																																			.broadcastChanges();
																																}
																																if ((entity instanceof ServerPlayer _plrSlotItem
																																		&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																		&& _splr.get() instanceof Map _slt
																																				? ((Slot) _slt
																																						.get(0))
																																						.getItem()
																																				: ItemStack.EMPTY)
																																		.getItem() == Blocks.STONE
																																				.asItem()) {
																																	if (entity instanceof ServerPlayer _player
																																			&& _player.containerMenu instanceof Supplier _current
																																			&& _current
																																					.get() instanceof Map _slots) {
																																		ItemStack _setstack = new ItemStack(
																																				Blocks.DIAMOND_ORE);
																																		_setstack
																																				.setCount(
																																						31);
																																		((Slot) _slots
																																				.get(1))
																																				.set(_setstack);
																																		_player.containerMenu
																																				.broadcastChanges();
																																	}
																																	if (entity instanceof ServerPlayer _player
																																			&& _player.containerMenu instanceof Supplier _current
																																			&& _current
																																					.get() instanceof Map _slots) {
																																		((Slot) _slots
																																				.get(0))
																																				.remove(1);
																																		_player.containerMenu
																																				.broadcastChanges();
																																	}
																																	if ((entity instanceof ServerPlayer _plrSlotItem
																																			&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																			&& _splr.get() instanceof Map _slt
																																					? ((Slot) _slt
																																							.get(0))
																																							.getItem()
																																					: ItemStack.EMPTY)
																																			.getItem() == Blocks.STONE
																																					.asItem()) {
																																		if (entity instanceof ServerPlayer _player
																																				&& _player.containerMenu instanceof Supplier _current
																																				&& _current
																																						.get() instanceof Map _slots) {
																																			ItemStack _setstack = new ItemStack(
																																					Blocks.DIAMOND_ORE);
																																			_setstack
																																					.setCount(
																																							32);
																																			((Slot) _slots
																																					.get(1))
																																					.set(_setstack);
																																			_player.containerMenu
																																					.broadcastChanges();
																																		}
																																		if (entity instanceof ServerPlayer _player
																																				&& _player.containerMenu instanceof Supplier _current
																																				&& _current
																																						.get() instanceof Map _slots) {
																																			((Slot) _slots
																																					.get(0))
																																					.remove(1);
																																			_player.containerMenu
																																					.broadcastChanges();
																																		}
																																		if ((entity instanceof ServerPlayer _plrSlotItem
																																				&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																				&& _splr.get() instanceof Map _slt
																																						? ((Slot) _slt
																																								.get(0))
																																								.getItem()
																																						: ItemStack.EMPTY)
																																				.getItem() == Blocks.STONE
																																						.asItem()) {
																																			if (entity instanceof ServerPlayer _player
																																					&& _player.containerMenu instanceof Supplier _current
																																					&& _current
																																							.get() instanceof Map _slots) {
																																				ItemStack _setstack = new ItemStack(
																																						Blocks.DIAMOND_ORE);
																																				_setstack
																																						.setCount(
																																								33);
																																				((Slot) _slots
																																						.get(1))
																																						.set(_setstack);
																																				_player.containerMenu
																																						.broadcastChanges();
																																			}
																																			if (entity instanceof ServerPlayer _player
																																					&& _player.containerMenu instanceof Supplier _current
																																					&& _current
																																							.get() instanceof Map _slots) {
																																				((Slot) _slots
																																						.get(0))
																																						.remove(1);
																																				_player.containerMenu
																																						.broadcastChanges();
																																			}
																																			if ((entity instanceof ServerPlayer _plrSlotItem
																																					&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																					&& _splr.get() instanceof Map _slt
																																							? ((Slot) _slt
																																									.get(0))
																																									.getItem()
																																							: ItemStack.EMPTY)
																																					.getItem() == Blocks.STONE
																																							.asItem()) {
																																				if (entity instanceof ServerPlayer _player
																																						&& _player.containerMenu instanceof Supplier _current
																																						&& _current
																																								.get() instanceof Map _slots) {
																																					ItemStack _setstack = new ItemStack(
																																							Blocks.DIAMOND_ORE);
																																					_setstack
																																							.setCount(
																																									34);
																																					((Slot) _slots
																																							.get(1))
																																							.set(_setstack);
																																					_player.containerMenu
																																							.broadcastChanges();
																																				}
																																				if (entity instanceof ServerPlayer _player
																																						&& _player.containerMenu instanceof Supplier _current
																																						&& _current
																																								.get() instanceof Map _slots) {
																																					((Slot) _slots
																																							.get(0))
																																							.remove(1);
																																					_player.containerMenu
																																							.broadcastChanges();
																																				}
																																				if ((entity instanceof ServerPlayer _plrSlotItem
																																						&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																						&& _splr.get() instanceof Map _slt
																																								? ((Slot) _slt
																																										.get(0))
																																										.getItem()
																																								: ItemStack.EMPTY)
																																						.getItem() == Blocks.STONE
																																								.asItem()) {
																																					if (entity instanceof ServerPlayer _player
																																							&& _player.containerMenu instanceof Supplier _current
																																							&& _current
																																									.get() instanceof Map _slots) {
																																						ItemStack _setstack = new ItemStack(
																																								Blocks.DIAMOND_ORE);
																																						_setstack
																																								.setCount(
																																										35);
																																						((Slot) _slots
																																								.get(1))
																																								.set(_setstack);
																																						_player.containerMenu
																																								.broadcastChanges();
																																					}
																																					if (entity instanceof ServerPlayer _player
																																							&& _player.containerMenu instanceof Supplier _current
																																							&& _current
																																									.get() instanceof Map _slots) {
																																						((Slot) _slots
																																								.get(0))
																																								.remove(1);
																																						_player.containerMenu
																																								.broadcastChanges();
																																					}
																																					if ((entity instanceof ServerPlayer _plrSlotItem
																																							&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																							&& _splr.get() instanceof Map _slt
																																									? ((Slot) _slt
																																											.get(0))
																																											.getItem()
																																									: ItemStack.EMPTY)
																																							.getItem() == Blocks.STONE
																																									.asItem()) {
																																						if (entity instanceof ServerPlayer _player
																																								&& _player.containerMenu instanceof Supplier _current
																																								&& _current
																																										.get() instanceof Map _slots) {
																																							ItemStack _setstack = new ItemStack(
																																									Blocks.DIAMOND_ORE);
																																							_setstack
																																									.setCount(
																																											36);
																																							((Slot) _slots
																																									.get(1))
																																									.set(_setstack);
																																							_player.containerMenu
																																									.broadcastChanges();
																																						}
																																						if (entity instanceof ServerPlayer _player
																																								&& _player.containerMenu instanceof Supplier _current
																																								&& _current
																																										.get() instanceof Map _slots) {
																																							((Slot) _slots
																																									.get(0))
																																									.remove(1);
																																							_player.containerMenu
																																									.broadcastChanges();
																																						}
																																						if ((entity instanceof ServerPlayer _plrSlotItem
																																								&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																								&& _splr.get() instanceof Map _slt
																																										? ((Slot) _slt
																																												.get(0))
																																												.getItem()
																																										: ItemStack.EMPTY)
																																								.getItem() == Blocks.STONE
																																										.asItem()) {
																																							if (entity instanceof ServerPlayer _player
																																									&& _player.containerMenu instanceof Supplier _current
																																									&& _current
																																											.get() instanceof Map _slots) {
																																								ItemStack _setstack = new ItemStack(
																																										Blocks.DIAMOND_ORE);
																																								_setstack
																																										.setCount(
																																												37);
																																								((Slot) _slots
																																										.get(1))
																																										.set(_setstack);
																																								_player.containerMenu
																																										.broadcastChanges();
																																							}
																																							if (entity instanceof ServerPlayer _player
																																									&& _player.containerMenu instanceof Supplier _current
																																									&& _current
																																											.get() instanceof Map _slots) {
																																								((Slot) _slots
																																										.get(0))
																																										.remove(1);
																																								_player.containerMenu
																																										.broadcastChanges();
																																							}
																																							if ((entity instanceof ServerPlayer _plrSlotItem
																																									&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																									&& _splr.get() instanceof Map _slt
																																											? ((Slot) _slt
																																													.get(0))
																																													.getItem()
																																											: ItemStack.EMPTY)
																																									.getItem() == Blocks.STONE
																																											.asItem()) {
																																								if (entity instanceof ServerPlayer _player
																																										&& _player.containerMenu instanceof Supplier _current
																																										&& _current
																																												.get() instanceof Map _slots) {
																																									ItemStack _setstack = new ItemStack(
																																											Blocks.DIAMOND_ORE);
																																									_setstack
																																											.setCount(
																																													38);
																																									((Slot) _slots
																																											.get(1))
																																											.set(_setstack);
																																									_player.containerMenu
																																											.broadcastChanges();
																																								}
																																								if (entity instanceof ServerPlayer _player
																																										&& _player.containerMenu instanceof Supplier _current
																																										&& _current
																																												.get() instanceof Map _slots) {
																																									((Slot) _slots
																																											.get(0))
																																											.remove(1);
																																									_player.containerMenu
																																											.broadcastChanges();
																																								}
																																								if ((entity instanceof ServerPlayer _plrSlotItem
																																										&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																										&& _splr.get() instanceof Map _slt
																																												? ((Slot) _slt
																																														.get(0))
																																														.getItem()
																																												: ItemStack.EMPTY)
																																										.getItem() == Blocks.STONE
																																												.asItem()) {
																																									if (entity instanceof ServerPlayer _player
																																											&& _player.containerMenu instanceof Supplier _current
																																											&& _current
																																													.get() instanceof Map _slots) {
																																										ItemStack _setstack = new ItemStack(
																																												Blocks.DIAMOND_ORE);
																																										_setstack
																																												.setCount(
																																														39);
																																										((Slot) _slots
																																												.get(1))
																																												.set(_setstack);
																																										_player.containerMenu
																																												.broadcastChanges();
																																									}
																																									if (entity instanceof ServerPlayer _player
																																											&& _player.containerMenu instanceof Supplier _current
																																											&& _current
																																													.get() instanceof Map _slots) {
																																										((Slot) _slots
																																												.get(0))
																																												.remove(1);
																																										_player.containerMenu
																																												.broadcastChanges();
																																									}
																																									if ((entity instanceof ServerPlayer _plrSlotItem
																																											&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																											&& _splr.get() instanceof Map _slt
																																													? ((Slot) _slt
																																															.get(0))
																																															.getItem()
																																													: ItemStack.EMPTY)
																																											.getItem() == Blocks.STONE
																																													.asItem()) {
																																										if (entity instanceof ServerPlayer _player
																																												&& _player.containerMenu instanceof Supplier _current
																																												&& _current
																																														.get() instanceof Map _slots) {
																																											ItemStack _setstack = new ItemStack(
																																													Blocks.DIAMOND_ORE);
																																											_setstack
																																													.setCount(
																																															40);
																																											((Slot) _slots
																																													.get(1))
																																													.set(_setstack);
																																											_player.containerMenu
																																													.broadcastChanges();
																																										}
																																										if (entity instanceof ServerPlayer _player
																																												&& _player.containerMenu instanceof Supplier _current
																																												&& _current
																																														.get() instanceof Map _slots) {
																																											((Slot) _slots
																																													.get(0))
																																													.remove(1);
																																											_player.containerMenu
																																													.broadcastChanges();
																																										}
																																										if ((entity instanceof ServerPlayer _plrSlotItem
																																												&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																												&& _splr.get() instanceof Map _slt
																																														? ((Slot) _slt
																																																.get(0))
																																																.getItem()
																																														: ItemStack.EMPTY)
																																												.getItem() == Blocks.STONE
																																														.asItem()) {
																																											if (entity instanceof ServerPlayer _player
																																													&& _player.containerMenu instanceof Supplier _current
																																													&& _current
																																															.get() instanceof Map _slots) {
																																												ItemStack _setstack = new ItemStack(
																																														Blocks.DIAMOND_ORE);
																																												_setstack
																																														.setCount(
																																																41);
																																												((Slot) _slots
																																														.get(1))
																																														.set(_setstack);
																																												_player.containerMenu
																																														.broadcastChanges();
																																											}
																																											if (entity instanceof ServerPlayer _player
																																													&& _player.containerMenu instanceof Supplier _current
																																													&& _current
																																															.get() instanceof Map _slots) {
																																												((Slot) _slots
																																														.get(0))
																																														.remove(1);
																																												_player.containerMenu
																																														.broadcastChanges();
																																											}
																																											if ((entity instanceof ServerPlayer _plrSlotItem
																																													&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																													&& _splr.get() instanceof Map _slt
																																															? ((Slot) _slt
																																																	.get(0))
																																																	.getItem()
																																															: ItemStack.EMPTY)
																																													.getItem() == Blocks.STONE
																																															.asItem()) {
																																												if (entity instanceof ServerPlayer _player
																																														&& _player.containerMenu instanceof Supplier _current
																																														&& _current
																																																.get() instanceof Map _slots) {
																																													ItemStack _setstack = new ItemStack(
																																															Blocks.DIAMOND_ORE);
																																													_setstack
																																															.setCount(
																																																	42);
																																													((Slot) _slots
																																															.get(1))
																																															.set(_setstack);
																																													_player.containerMenu
																																															.broadcastChanges();
																																												}
																																												if (entity instanceof ServerPlayer _player
																																														&& _player.containerMenu instanceof Supplier _current
																																														&& _current
																																																.get() instanceof Map _slots) {
																																													((Slot) _slots
																																															.get(0))
																																															.remove(1);
																																													_player.containerMenu
																																															.broadcastChanges();
																																												}
																																												if ((entity instanceof ServerPlayer _plrSlotItem
																																														&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																														&& _splr.get() instanceof Map _slt
																																																? ((Slot) _slt
																																																		.get(0))
																																																		.getItem()
																																																: ItemStack.EMPTY)
																																														.getItem() == Blocks.STONE
																																																.asItem()) {
																																													if (entity instanceof ServerPlayer _player
																																															&& _player.containerMenu instanceof Supplier _current
																																															&& _current
																																																	.get() instanceof Map _slots) {
																																														ItemStack _setstack = new ItemStack(
																																																Blocks.DIAMOND_ORE);
																																														_setstack
																																																.setCount(
																																																		43);
																																														((Slot) _slots
																																																.get(1))
																																																.set(_setstack);
																																														_player.containerMenu
																																																.broadcastChanges();
																																													}
																																													if (entity instanceof ServerPlayer _player
																																															&& _player.containerMenu instanceof Supplier _current
																																															&& _current
																																																	.get() instanceof Map _slots) {
																																														((Slot) _slots
																																																.get(0))
																																																.remove(1);
																																														_player.containerMenu
																																																.broadcastChanges();
																																													}
																																													if ((entity instanceof ServerPlayer _plrSlotItem
																																															&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																															&& _splr.get() instanceof Map _slt
																																																	? ((Slot) _slt
																																																			.get(0))
																																																			.getItem()
																																																	: ItemStack.EMPTY)
																																															.getItem() == Blocks.STONE
																																																	.asItem()) {
																																														if (entity instanceof ServerPlayer _player
																																																&& _player.containerMenu instanceof Supplier _current
																																																&& _current
																																																		.get() instanceof Map _slots) {
																																															ItemStack _setstack = new ItemStack(
																																																	Blocks.DIAMOND_ORE);
																																															_setstack
																																																	.setCount(
																																																			44);
																																															((Slot) _slots
																																																	.get(1))
																																																	.set(_setstack);
																																															_player.containerMenu
																																																	.broadcastChanges();
																																														}
																																														if (entity instanceof ServerPlayer _player
																																																&& _player.containerMenu instanceof Supplier _current
																																																&& _current
																																																		.get() instanceof Map _slots) {
																																															((Slot) _slots
																																																	.get(0))
																																																	.remove(1);
																																															_player.containerMenu
																																																	.broadcastChanges();
																																														}
																																														if ((entity instanceof ServerPlayer _plrSlotItem
																																																&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																&& _splr.get() instanceof Map _slt
																																																		? ((Slot) _slt
																																																				.get(0))
																																																				.getItem()
																																																		: ItemStack.EMPTY)
																																																.getItem() == Blocks.STONE
																																																		.asItem()) {
																																															if (entity instanceof ServerPlayer _player
																																																	&& _player.containerMenu instanceof Supplier _current
																																																	&& _current
																																																			.get() instanceof Map _slots) {
																																																ItemStack _setstack = new ItemStack(
																																																		Blocks.DIAMOND_ORE);
																																																_setstack
																																																		.setCount(
																																																				45);
																																																((Slot) _slots
																																																		.get(1))
																																																		.set(_setstack);
																																																_player.containerMenu
																																																		.broadcastChanges();
																																															}
																																															if (entity instanceof ServerPlayer _player
																																																	&& _player.containerMenu instanceof Supplier _current
																																																	&& _current
																																																			.get() instanceof Map _slots) {
																																																((Slot) _slots
																																																		.get(0))
																																																		.remove(1);
																																																_player.containerMenu
																																																		.broadcastChanges();
																																															}
																																															if ((entity instanceof ServerPlayer _plrSlotItem
																																																	&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																	&& _splr.get() instanceof Map _slt
																																																			? ((Slot) _slt
																																																					.get(0))
																																																					.getItem()
																																																			: ItemStack.EMPTY)
																																																	.getItem() == Blocks.STONE
																																																			.asItem()) {
																																																if (entity instanceof ServerPlayer _player
																																																		&& _player.containerMenu instanceof Supplier _current
																																																		&& _current
																																																				.get() instanceof Map _slots) {
																																																	ItemStack _setstack = new ItemStack(
																																																			Blocks.DIAMOND_ORE);
																																																	_setstack
																																																			.setCount(
																																																					46);
																																																	((Slot) _slots
																																																			.get(1))
																																																			.set(_setstack);
																																																	_player.containerMenu
																																																			.broadcastChanges();
																																																}
																																																if (entity instanceof ServerPlayer _player
																																																		&& _player.containerMenu instanceof Supplier _current
																																																		&& _current
																																																				.get() instanceof Map _slots) {
																																																	((Slot) _slots
																																																			.get(0))
																																																			.remove(1);
																																																	_player.containerMenu
																																																			.broadcastChanges();
																																																}
																																																if ((entity instanceof ServerPlayer _plrSlotItem
																																																		&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																		&& _splr.get() instanceof Map _slt
																																																				? ((Slot) _slt
																																																						.get(0))
																																																						.getItem()
																																																				: ItemStack.EMPTY)
																																																		.getItem() == Blocks.STONE
																																																				.asItem()) {
																																																	if (entity instanceof ServerPlayer _player
																																																			&& _player.containerMenu instanceof Supplier _current
																																																			&& _current
																																																					.get() instanceof Map _slots) {
																																																		ItemStack _setstack = new ItemStack(
																																																				Blocks.DIAMOND_ORE);
																																																		_setstack
																																																				.setCount(
																																																						47);
																																																		((Slot) _slots
																																																				.get(1))
																																																				.set(_setstack);
																																																		_player.containerMenu
																																																				.broadcastChanges();
																																																	}
																																																	if (entity instanceof ServerPlayer _player
																																																			&& _player.containerMenu instanceof Supplier _current
																																																			&& _current
																																																					.get() instanceof Map _slots) {
																																																		((Slot) _slots
																																																				.get(0))
																																																				.remove(1);
																																																		_player.containerMenu
																																																				.broadcastChanges();
																																																	}
																																																	if ((entity instanceof ServerPlayer _plrSlotItem
																																																			&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																			&& _splr.get() instanceof Map _slt
																																																					? ((Slot) _slt
																																																							.get(0))
																																																							.getItem()
																																																					: ItemStack.EMPTY)
																																																			.getItem() == Blocks.STONE
																																																					.asItem()) {
																																																		if (entity instanceof ServerPlayer _player
																																																				&& _player.containerMenu instanceof Supplier _current
																																																				&& _current
																																																						.get() instanceof Map _slots) {
																																																			ItemStack _setstack = new ItemStack(
																																																					Blocks.DIAMOND_ORE);
																																																			_setstack
																																																					.setCount(
																																																							18);
																																																			((Slot) _slots
																																																					.get(1))
																																																					.set(_setstack);
																																																			_player.containerMenu
																																																					.broadcastChanges();
																																																		}
																																																		if (entity instanceof ServerPlayer _player
																																																				&& _player.containerMenu instanceof Supplier _current
																																																				&& _current
																																																						.get() instanceof Map _slots) {
																																																			((Slot) _slots
																																																					.get(0))
																																																					.remove(1);
																																																			_player.containerMenu
																																																					.broadcastChanges();
																																																		}
																																																		if ((entity instanceof ServerPlayer _plrSlotItem
																																																				&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																				&& _splr.get() instanceof Map _slt
																																																						? ((Slot) _slt
																																																								.get(0))
																																																								.getItem()
																																																						: ItemStack.EMPTY)
																																																				.getItem() == Blocks.STONE
																																																						.asItem()) {
																																																			if (entity instanceof ServerPlayer _player
																																																					&& _player.containerMenu instanceof Supplier _current
																																																					&& _current
																																																							.get() instanceof Map _slots) {
																																																				ItemStack _setstack = new ItemStack(
																																																						Blocks.DIAMOND_ORE);
																																																				_setstack
																																																						.setCount(
																																																								48);
																																																				((Slot) _slots
																																																						.get(1))
																																																						.set(_setstack);
																																																				_player.containerMenu
																																																						.broadcastChanges();
																																																			}
																																																			if (entity instanceof ServerPlayer _player
																																																					&& _player.containerMenu instanceof Supplier _current
																																																					&& _current
																																																							.get() instanceof Map _slots) {
																																																				((Slot) _slots
																																																						.get(0))
																																																						.remove(1);
																																																				_player.containerMenu
																																																						.broadcastChanges();
																																																			}
																																																			if ((entity instanceof ServerPlayer _plrSlotItem
																																																					&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																					&& _splr.get() instanceof Map _slt
																																																							? ((Slot) _slt
																																																									.get(0))
																																																									.getItem()
																																																							: ItemStack.EMPTY)
																																																					.getItem() == Blocks.STONE
																																																							.asItem()) {
																																																				if (entity instanceof ServerPlayer _player
																																																						&& _player.containerMenu instanceof Supplier _current
																																																						&& _current
																																																								.get() instanceof Map _slots) {
																																																					ItemStack _setstack = new ItemStack(
																																																							Blocks.DIAMOND_ORE);
																																																					_setstack
																																																							.setCount(
																																																									49);
																																																					((Slot) _slots
																																																							.get(1))
																																																							.set(_setstack);
																																																					_player.containerMenu
																																																							.broadcastChanges();
																																																				}
																																																				if (entity instanceof ServerPlayer _player
																																																						&& _player.containerMenu instanceof Supplier _current
																																																						&& _current
																																																								.get() instanceof Map _slots) {
																																																					((Slot) _slots
																																																							.get(0))
																																																							.remove(1);
																																																					_player.containerMenu
																																																							.broadcastChanges();
																																																				}
																																																				if ((entity instanceof ServerPlayer _plrSlotItem
																																																						&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																						&& _splr.get() instanceof Map _slt
																																																								? ((Slot) _slt
																																																										.get(0))
																																																										.getItem()
																																																								: ItemStack.EMPTY)
																																																						.getItem() == Blocks.STONE
																																																								.asItem()) {
																																																					if (entity instanceof ServerPlayer _player
																																																							&& _player.containerMenu instanceof Supplier _current
																																																							&& _current
																																																									.get() instanceof Map _slots) {
																																																						ItemStack _setstack = new ItemStack(
																																																								Blocks.DIAMOND_ORE);
																																																						_setstack
																																																								.setCount(
																																																										50);
																																																						((Slot) _slots
																																																								.get(1))
																																																								.set(_setstack);
																																																						_player.containerMenu
																																																								.broadcastChanges();
																																																					}
																																																					if (entity instanceof ServerPlayer _player
																																																							&& _player.containerMenu instanceof Supplier _current
																																																							&& _current
																																																									.get() instanceof Map _slots) {
																																																						((Slot) _slots
																																																								.get(0))
																																																								.remove(1);
																																																						_player.containerMenu
																																																								.broadcastChanges();
																																																					}
																																																					if ((entity instanceof ServerPlayer _plrSlotItem
																																																							&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																							&& _splr.get() instanceof Map _slt
																																																									? ((Slot) _slt
																																																											.get(0))
																																																											.getItem()
																																																									: ItemStack.EMPTY)
																																																							.getItem() == Blocks.STONE
																																																									.asItem()) {
																																																						if (entity instanceof ServerPlayer _player
																																																								&& _player.containerMenu instanceof Supplier _current
																																																								&& _current
																																																										.get() instanceof Map _slots) {
																																																							ItemStack _setstack = new ItemStack(
																																																									Blocks.DIAMOND_ORE);
																																																							_setstack
																																																									.setCount(
																																																											51);
																																																							((Slot) _slots
																																																									.get(1))
																																																									.set(_setstack);
																																																							_player.containerMenu
																																																									.broadcastChanges();
																																																						}
																																																						if (entity instanceof ServerPlayer _player
																																																								&& _player.containerMenu instanceof Supplier _current
																																																								&& _current
																																																										.get() instanceof Map _slots) {
																																																							((Slot) _slots
																																																									.get(0))
																																																									.remove(1);
																																																							_player.containerMenu
																																																									.broadcastChanges();
																																																						}
																																																						if ((entity instanceof ServerPlayer _plrSlotItem
																																																								&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																								&& _splr.get() instanceof Map _slt
																																																										? ((Slot) _slt
																																																												.get(0))
																																																												.getItem()
																																																										: ItemStack.EMPTY)
																																																								.getItem() == Blocks.STONE
																																																										.asItem()) {
																																																							if (entity instanceof ServerPlayer _player
																																																									&& _player.containerMenu instanceof Supplier _current
																																																									&& _current
																																																											.get() instanceof Map _slots) {
																																																								ItemStack _setstack = new ItemStack(
																																																										Blocks.DIAMOND_ORE);
																																																								_setstack
																																																										.setCount(
																																																												52);
																																																								((Slot) _slots
																																																										.get(1))
																																																										.set(_setstack);
																																																								_player.containerMenu
																																																										.broadcastChanges();
																																																							}
																																																							if (entity instanceof ServerPlayer _player
																																																									&& _player.containerMenu instanceof Supplier _current
																																																									&& _current
																																																											.get() instanceof Map _slots) {
																																																								((Slot) _slots
																																																										.get(0))
																																																										.remove(1);
																																																								_player.containerMenu
																																																										.broadcastChanges();
																																																							}
																																																							if ((entity instanceof ServerPlayer _plrSlotItem
																																																									&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																									&& _splr.get() instanceof Map _slt
																																																											? ((Slot) _slt
																																																													.get(0))
																																																													.getItem()
																																																											: ItemStack.EMPTY)
																																																									.getItem() == Blocks.STONE
																																																											.asItem()) {
																																																								if (entity instanceof ServerPlayer _player
																																																										&& _player.containerMenu instanceof Supplier _current
																																																										&& _current
																																																												.get() instanceof Map _slots) {
																																																									ItemStack _setstack = new ItemStack(
																																																											Blocks.DIAMOND_ORE);
																																																									_setstack
																																																											.setCount(
																																																													53);
																																																									((Slot) _slots
																																																											.get(1))
																																																											.set(_setstack);
																																																									_player.containerMenu
																																																											.broadcastChanges();
																																																								}
																																																								if (entity instanceof ServerPlayer _player
																																																										&& _player.containerMenu instanceof Supplier _current
																																																										&& _current
																																																												.get() instanceof Map _slots) {
																																																									((Slot) _slots
																																																											.get(0))
																																																											.remove(1);
																																																									_player.containerMenu
																																																											.broadcastChanges();
																																																								}
																																																								if ((entity instanceof ServerPlayer _plrSlotItem
																																																										&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																										&& _splr.get() instanceof Map _slt
																																																												? ((Slot) _slt
																																																														.get(0))
																																																														.getItem()
																																																												: ItemStack.EMPTY)
																																																										.getItem() == Blocks.STONE
																																																												.asItem()) {
																																																									if (entity instanceof ServerPlayer _player
																																																											&& _player.containerMenu instanceof Supplier _current
																																																											&& _current
																																																													.get() instanceof Map _slots) {
																																																										ItemStack _setstack = new ItemStack(
																																																												Blocks.DIAMOND_ORE);
																																																										_setstack
																																																												.setCount(
																																																														54);
																																																										((Slot) _slots
																																																												.get(1))
																																																												.set(_setstack);
																																																										_player.containerMenu
																																																												.broadcastChanges();
																																																									}
																																																									if (entity instanceof ServerPlayer _player
																																																											&& _player.containerMenu instanceof Supplier _current
																																																											&& _current
																																																													.get() instanceof Map _slots) {
																																																										((Slot) _slots
																																																												.get(0))
																																																												.remove(1);
																																																										_player.containerMenu
																																																												.broadcastChanges();
																																																									}
																																																									if ((entity instanceof ServerPlayer _plrSlotItem
																																																											&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																											&& _splr.get() instanceof Map _slt
																																																													? ((Slot) _slt
																																																															.get(0))
																																																															.getItem()
																																																													: ItemStack.EMPTY)
																																																											.getItem() == Blocks.STONE
																																																													.asItem()) {
																																																										if (entity instanceof ServerPlayer _player
																																																												&& _player.containerMenu instanceof Supplier _current
																																																												&& _current
																																																														.get() instanceof Map _slots) {
																																																											ItemStack _setstack = new ItemStack(
																																																													Blocks.DIAMOND_ORE);
																																																											_setstack
																																																													.setCount(
																																																															55);
																																																											((Slot) _slots
																																																													.get(1))
																																																													.set(_setstack);
																																																											_player.containerMenu
																																																													.broadcastChanges();
																																																										}
																																																										if (entity instanceof ServerPlayer _player
																																																												&& _player.containerMenu instanceof Supplier _current
																																																												&& _current
																																																														.get() instanceof Map _slots) {
																																																											((Slot) _slots
																																																													.get(0))
																																																													.remove(1);
																																																											_player.containerMenu
																																																													.broadcastChanges();
																																																										}
																																																										if ((entity instanceof ServerPlayer _plrSlotItem
																																																												&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																												&& _splr.get() instanceof Map _slt
																																																														? ((Slot) _slt
																																																																.get(0))
																																																																.getItem()
																																																														: ItemStack.EMPTY)
																																																												.getItem() == Blocks.STONE
																																																														.asItem()) {
																																																											if (entity instanceof ServerPlayer _player
																																																													&& _player.containerMenu instanceof Supplier _current
																																																													&& _current
																																																															.get() instanceof Map _slots) {
																																																												ItemStack _setstack = new ItemStack(
																																																														Blocks.DIAMOND_ORE);
																																																												_setstack
																																																														.setCount(
																																																																56);
																																																												((Slot) _slots
																																																														.get(1))
																																																														.set(_setstack);
																																																												_player.containerMenu
																																																														.broadcastChanges();
																																																											}
																																																											if (entity instanceof ServerPlayer _player
																																																													&& _player.containerMenu instanceof Supplier _current
																																																													&& _current
																																																															.get() instanceof Map _slots) {
																																																												((Slot) _slots
																																																														.get(0))
																																																														.remove(1);
																																																												_player.containerMenu
																																																														.broadcastChanges();
																																																											}
																																																											if ((entity instanceof ServerPlayer _plrSlotItem
																																																													&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																													&& _splr.get() instanceof Map _slt
																																																															? ((Slot) _slt
																																																																	.get(0))
																																																																	.getItem()
																																																															: ItemStack.EMPTY)
																																																													.getItem() == Blocks.STONE
																																																															.asItem()) {
																																																												if (entity instanceof ServerPlayer _player
																																																														&& _player.containerMenu instanceof Supplier _current
																																																														&& _current
																																																																.get() instanceof Map _slots) {
																																																													ItemStack _setstack = new ItemStack(
																																																															Blocks.DIAMOND_ORE);
																																																													_setstack
																																																															.setCount(
																																																																	57);
																																																													((Slot) _slots
																																																															.get(1))
																																																															.set(_setstack);
																																																													_player.containerMenu
																																																															.broadcastChanges();
																																																												}
																																																												if (entity instanceof ServerPlayer _player
																																																														&& _player.containerMenu instanceof Supplier _current
																																																														&& _current
																																																																.get() instanceof Map _slots) {
																																																													((Slot) _slots
																																																															.get(0))
																																																															.remove(1);
																																																													_player.containerMenu
																																																															.broadcastChanges();
																																																												}
																																																												if ((entity instanceof ServerPlayer _plrSlotItem
																																																														&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																														&& _splr.get() instanceof Map _slt
																																																																? ((Slot) _slt
																																																																		.get(0))
																																																																		.getItem()
																																																																: ItemStack.EMPTY)
																																																														.getItem() == Blocks.STONE
																																																																.asItem()) {
																																																													if (entity instanceof ServerPlayer _player
																																																															&& _player.containerMenu instanceof Supplier _current
																																																															&& _current
																																																																	.get() instanceof Map _slots) {
																																																														ItemStack _setstack = new ItemStack(
																																																																Blocks.DIAMOND_ORE);
																																																														_setstack
																																																																.setCount(
																																																																		58);
																																																														((Slot) _slots
																																																																.get(1))
																																																																.set(_setstack);
																																																														_player.containerMenu
																																																																.broadcastChanges();
																																																													}
																																																													if (entity instanceof ServerPlayer _player
																																																															&& _player.containerMenu instanceof Supplier _current
																																																															&& _current
																																																																	.get() instanceof Map _slots) {
																																																														((Slot) _slots
																																																																.get(0))
																																																																.remove(1);
																																																														_player.containerMenu
																																																																.broadcastChanges();
																																																													}
																																																													if ((entity instanceof ServerPlayer _plrSlotItem
																																																															&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																															&& _splr.get() instanceof Map _slt
																																																																	? ((Slot) _slt
																																																																			.get(0))
																																																																			.getItem()
																																																																	: ItemStack.EMPTY)
																																																															.getItem() == Blocks.STONE
																																																																	.asItem()) {
																																																														if (entity instanceof ServerPlayer _player
																																																																&& _player.containerMenu instanceof Supplier _current
																																																																&& _current
																																																																		.get() instanceof Map _slots) {
																																																															ItemStack _setstack = new ItemStack(
																																																																	Blocks.DIAMOND_ORE);
																																																															_setstack
																																																																	.setCount(
																																																																			59);
																																																															((Slot) _slots
																																																																	.get(1))
																																																																	.set(_setstack);
																																																															_player.containerMenu
																																																																	.broadcastChanges();
																																																														}
																																																														if (entity instanceof ServerPlayer _player
																																																																&& _player.containerMenu instanceof Supplier _current
																																																																&& _current
																																																																		.get() instanceof Map _slots) {
																																																															((Slot) _slots
																																																																	.get(0))
																																																																	.remove(1);
																																																															_player.containerMenu
																																																																	.broadcastChanges();
																																																														}
																																																														if ((entity instanceof ServerPlayer _plrSlotItem
																																																																&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																																&& _splr.get() instanceof Map _slt
																																																																		? ((Slot) _slt
																																																																				.get(0))
																																																																				.getItem()
																																																																		: ItemStack.EMPTY)
																																																																.getItem() == Blocks.STONE
																																																																		.asItem()) {
																																																															if (entity instanceof ServerPlayer _player
																																																																	&& _player.containerMenu instanceof Supplier _current
																																																																	&& _current
																																																																			.get() instanceof Map _slots) {
																																																																ItemStack _setstack = new ItemStack(
																																																																		Blocks.DIAMOND_ORE);
																																																																_setstack
																																																																		.setCount(
																																																																				60);
																																																																((Slot) _slots
																																																																		.get(1))
																																																																		.set(_setstack);
																																																																_player.containerMenu
																																																																		.broadcastChanges();
																																																															}
																																																															if (entity instanceof ServerPlayer _player
																																																																	&& _player.containerMenu instanceof Supplier _current
																																																																	&& _current
																																																																			.get() instanceof Map _slots) {
																																																																((Slot) _slots
																																																																		.get(0))
																																																																		.remove(1);
																																																																_player.containerMenu
																																																																		.broadcastChanges();
																																																															}
																																																															if ((entity instanceof ServerPlayer _plrSlotItem
																																																																	&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																																	&& _splr.get() instanceof Map _slt
																																																																			? ((Slot) _slt
																																																																					.get(0))
																																																																					.getItem()
																																																																			: ItemStack.EMPTY)
																																																																	.getItem() == Blocks.STONE
																																																																			.asItem()) {
																																																																if (entity instanceof ServerPlayer _player
																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																		&& _current
																																																																				.get() instanceof Map _slots) {
																																																																	ItemStack _setstack = new ItemStack(
																																																																			Blocks.DIAMOND_ORE);
																																																																	_setstack
																																																																			.setCount(
																																																																					61);
																																																																	((Slot) _slots
																																																																			.get(1))
																																																																			.set(_setstack);
																																																																	_player.containerMenu
																																																																			.broadcastChanges();
																																																																}
																																																																if (entity instanceof ServerPlayer _player
																																																																		&& _player.containerMenu instanceof Supplier _current
																																																																		&& _current
																																																																				.get() instanceof Map _slots) {
																																																																	((Slot) _slots
																																																																			.get(0))
																																																																			.remove(1);
																																																																	_player.containerMenu
																																																																			.broadcastChanges();
																																																																}
																																																																if ((entity instanceof ServerPlayer _plrSlotItem
																																																																		&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																																		&& _splr.get() instanceof Map _slt
																																																																				? ((Slot) _slt
																																																																						.get(0))
																																																																						.getItem()
																																																																				: ItemStack.EMPTY)
																																																																		.getItem() == Blocks.STONE
																																																																				.asItem()) {
																																																																	if (entity instanceof ServerPlayer _player
																																																																			&& _player.containerMenu instanceof Supplier _current
																																																																			&& _current
																																																																					.get() instanceof Map _slots) {
																																																																		ItemStack _setstack = new ItemStack(
																																																																				Blocks.DIAMOND_ORE);
																																																																		_setstack
																																																																				.setCount(
																																																																						62);
																																																																		((Slot) _slots
																																																																				.get(1))
																																																																				.set(_setstack);
																																																																		_player.containerMenu
																																																																				.broadcastChanges();
																																																																	}
																																																																	if (entity instanceof ServerPlayer _player
																																																																			&& _player.containerMenu instanceof Supplier _current
																																																																			&& _current
																																																																					.get() instanceof Map _slots) {
																																																																		((Slot) _slots
																																																																				.get(0))
																																																																				.remove(1);
																																																																		_player.containerMenu
																																																																				.broadcastChanges();
																																																																	}
																																																																	if ((entity instanceof ServerPlayer _plrSlotItem
																																																																			&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																																			&& _splr.get() instanceof Map _slt
																																																																					? ((Slot) _slt
																																																																							.get(0))
																																																																							.getItem()
																																																																					: ItemStack.EMPTY)
																																																																			.getItem() == Blocks.STONE
																																																																					.asItem()) {
																																																																		if (entity instanceof ServerPlayer _player
																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																				&& _current
																																																																						.get() instanceof Map _slots) {
																																																																			ItemStack _setstack = new ItemStack(
																																																																					Blocks.DIAMOND_ORE);
																																																																			_setstack
																																																																					.setCount(
																																																																							63);
																																																																			((Slot) _slots
																																																																					.get(1))
																																																																					.set(_setstack);
																																																																			_player.containerMenu
																																																																					.broadcastChanges();
																																																																		}
																																																																		if (entity instanceof ServerPlayer _player
																																																																				&& _player.containerMenu instanceof Supplier _current
																																																																				&& _current
																																																																						.get() instanceof Map _slots) {
																																																																			((Slot) _slots
																																																																					.get(0))
																																																																					.remove(1);
																																																																			_player.containerMenu
																																																																					.broadcastChanges();
																																																																		}
																																																																		if ((entity instanceof ServerPlayer _plrSlotItem
																																																																				&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																																																				&& _splr.get() instanceof Map _slt
																																																																						? ((Slot) _slt
																																																																								.get(0))
																																																																								.getItem()
																																																																						: ItemStack.EMPTY)
																																																																				.getItem() == Blocks.STONE
																																																																						.asItem()) {
																																																																			if (entity instanceof ServerPlayer _player
																																																																					&& _player.containerMenu instanceof Supplier _current
																																																																					&& _current
																																																																							.get() instanceof Map _slots) {
																																																																				ItemStack _setstack = new ItemStack(
																																																																						Blocks.DIAMOND_ORE);
																																																																				_setstack
																																																																						.setCount(
																																																																								65);
																																																																				((Slot) _slots
																																																																						.get(1))
																																																																						.set(_setstack);
																																																																				_player.containerMenu
																																																																						.broadcastChanges();
																																																																			}
																																																																			if (entity instanceof ServerPlayer _player
																																																																					&& _player.containerMenu instanceof Supplier _current
																																																																					&& _current
																																																																							.get() instanceof Map _slots) {
																																																																				((Slot) _slots
																																																																						.get(0))
																																																																						.remove(1);
																																																																				_player.containerMenu
																																																																						.broadcastChanges();
																																																																			}
																																																																		} else {
																																																																			McMod.LOGGER
																																																																					.info(" There are no stones. Fill the stones!");
																																																																		}
																																																																	} else {
																																																																		McMod.LOGGER
																																																																				.info(" There are no stones. Fill the stones!");
																																																																	}
																																																																} else {
																																																																	McMod.LOGGER
																																																																			.info(" There are no stones. Fill the stones!");
																																																																}
																																																															} else {
																																																																McMod.LOGGER
																																																																		.info(" There are no stones. Fill the stones!");
																																																															}
																																																														} else {
																																																															McMod.LOGGER
																																																																	.info(" There are no stones. Fill the stones!");
																																																														}
																																																													} else {
																																																														McMod.LOGGER
																																																																.info(" There are no stones. Fill the stones!");
																																																													}
																																																												} else {
																																																													McMod.LOGGER
																																																															.info(" There are no stones. Fill the stones!");
																																																												}
																																																											} else {
																																																												McMod.LOGGER
																																																														.info(" There are no stones. Fill the stones!");
																																																											}
																																																										} else {
																																																											McMod.LOGGER
																																																													.info(" There are no stones. Fill the stones!");
																																																										}
																																																									} else {
																																																										McMod.LOGGER
																																																												.info(" There are no stones. Fill the stones!");
																																																									}
																																																								} else {
																																																									McMod.LOGGER
																																																											.info(" There are no stones. Fill the stones!");
																																																								}
																																																							} else {
																																																								McMod.LOGGER
																																																										.info(" There are no stones. Fill the stones!");
																																																							}
																																																						} else {
																																																							McMod.LOGGER
																																																									.info(" There are no stones. Fill the stones!");
																																																						}
																																																					} else {
																																																						McMod.LOGGER
																																																								.info(" There are no stones. Fill the stones!");
																																																					}
																																																				} else {
																																																					McMod.LOGGER
																																																							.info(" There are no stones. Fill the stones!");
																																																				}
																																																			} else {
																																																				McMod.LOGGER
																																																						.info(" There are no stones. Fill the stones!");
																																																			}
																																																		} else {
																																																			McMod.LOGGER
																																																					.info(" There are no stones. Fill the stones!");
																																																		}
																																																	} else {
																																																		McMod.LOGGER
																																																				.info(" There are no stones. Fill the stones!");
																																																	}
																																																} else {
																																																	McMod.LOGGER
																																																			.info(" There are no stones. Fill the stones!");
																																																}
																																															} else {
																																																McMod.LOGGER
																																																		.info(" There are no stones. Fill the stones!");
																																															}
																																														} else {
																																															McMod.LOGGER
																																																	.info(" There are no stones. Fill the stones!");
																																														}
																																													} else {
																																														McMod.LOGGER
																																																.info(" There are no stones. Fill the stones!");
																																													}
																																												} else {
																																													McMod.LOGGER
																																															.info(" There are no stones. Fill the stones!");
																																												}
																																											} else {
																																												McMod.LOGGER
																																														.info(" There are no stones. Fill the stones!");
																																											}
																																										} else {
																																											McMod.LOGGER
																																													.info(" There are no stones. Fill the stones!");
																																										}
																																									} else {
																																										McMod.LOGGER
																																												.info(" There are no stones. Fill the stones!");
																																									}
																																								} else {
																																									McMod.LOGGER
																																											.info(" There are no stones. Fill the stones!");
																																								}
																																							} else {
																																								McMod.LOGGER
																																										.info(" There are no stones. Fill the stones!");
																																							}
																																						} else {
																																							McMod.LOGGER
																																									.info(" There are no stones. Fill the stones!");
																																						}
																																					} else {
																																						McMod.LOGGER
																																								.info(" There are no stones. Fill the stones!");
																																					}
																																				} else {
																																					McMod.LOGGER
																																							.info(" There are no stones. Fill the stones!");
																																				}
																																			} else {
																																				McMod.LOGGER
																																						.info(" There are no stones. Fill the stones!");
																																			}
																																		} else {
																																			McMod.LOGGER
																																					.info(" There are no stones. Fill the stones!");
																																		}
																																	} else {
																																		McMod.LOGGER
																																				.info(" There are no stones. Fill the stones!");
																																	}
																																} else {
																																	McMod.LOGGER.info(
																																			" There are no stones. Fill the stones!");
																																}
																															} else {
																																McMod.LOGGER.info(
																																		" There are no stones. Fill the stones!");
																															}
																														} else {
																															McMod.LOGGER.info(
																																	" There are no stones. Fill the stones!");
																														}
																													} else {
																														McMod.LOGGER.info(
																																" There are no stones. Fill the stones!");
																													}
																												} else {
																													McMod.LOGGER.info(
																															" There are no stones. Fill the stones!");
																												}
																											} else {
																												McMod.LOGGER.info(
																														" There are no stones. Fill the stones!");
																											}
																										} else {
																											McMod.LOGGER.info(
																													" There are no stones. Fill the stones!");
																										}
																									} else {
																										McMod.LOGGER.info(
																												" There are no stones. Fill the stones!");
																									}
																								} else {
																									McMod.LOGGER.info(
																											" There are no stones. Fill the stones!");
																								}
																							} else {
																								McMod.LOGGER.info(
																										" There are no stones. Fill the stones!");
																							}
																						} else {
																							McMod.LOGGER
																									.info(" There are no stones. Fill the stones!");
																						}
																					} else {
																						McMod.LOGGER.info(" There are no stones. Fill the stones!");
																					}
																				} else {
																					McMod.LOGGER.info(" There are no stones. Fill the stones!");
																				}
																			} else {
																				McMod.LOGGER.info(" There are no stones. Fill the stones!");
																			}
																		} else {
																			McMod.LOGGER.info(" There are no stones. Fill the stones!");
																		}
																	} else {
																		McMod.LOGGER.info(" There are no stones. Fill the stones!");
																	}
																} else {
																	McMod.LOGGER.info(" There are no stones. Fill the stones!");
																}
															} else {
																McMod.LOGGER.info(" There are no stones. Fill the stones!");
															}
														} else {
															McMod.LOGGER.info(" There are no stones. Fill the stones!");
														}
													} else {
														McMod.LOGGER.info(" There are no stones. Fill the stones!");
													}
												} else {
													McMod.LOGGER.info(" There are no stones. Fill the stones!");
												}
											} else {
												McMod.LOGGER.info(" There are no stones. Fill the stones!");
											}
										}
									} else {
										McMod.LOGGER.info(" There are no stones. Fill the stones!");
									}
								} else {
									McMod.LOGGER.info(" There are no stones. Fill the stones!");
								}
							} else {
								McMod.LOGGER.info(" There are no stones. Fill the stones!");
							}
						} else {
							McMod.LOGGER.info(" There are no stones. Fill the stones!");
						}
					} else {
						McMod.LOGGER.info(" There are no stones. Fill the stones!");
					}
				} else {
					McMod.LOGGER.info(" There are no stones. Fill the stones!");
				}
			} else {
				McMod.LOGGER.info(" There are no stones. Fill the stones!");
			}
		} else {
			McMod.LOGGER.info(" There are no stones. Fill the stones!");
		}
	}
}
