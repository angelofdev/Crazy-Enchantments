package me.BadBones69.CrazyEnchantments.Enchantments.Swords;

import java.util.Random;

import me.BadBones69.CrazyEnchantments.Api;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class LifeSteal implements Listener{
	@EventHandler
	public void onPlayerDamage(EntityDamageByEntityEvent e){
		if(e.isCancelled())return;
		if(e.getEntity() instanceof LivingEntity){
			if(e.getDamager() instanceof Player){
				Player damager = (Player) e.getDamager();
				if(damager.getItemInHand().hasItemMeta()){
					if(!damager.getItemInHand().getItemMeta().hasLore())return;
					if(!e.getEntity().isDead()){
						if(damager.getItemInHand().getItemMeta().getLore().contains(Api.color("&7LifeSteal I"))){
							Random number = new Random();
							int chance;
							for(int counter = 1; counter<=1; counter++){
								chance = 1 + number.nextInt(5);
								if(chance == 1){
									if(damager.getHealth() + 1 < damager.getMaxHealth()){
										damager.setHealth(damager.getHealth() + 1);
									}
									if(damager.getHealth() + 1 >= damager.getMaxHealth()){
										damager.setHealth(damager.getMaxHealth());
									}
								}
							}
						}
						if(damager.getItemInHand().getItemMeta().getLore().contains(Api.color("&7LifeSteal II"))){
							Random number = new Random();
							int chance;
							for(int counter = 1; counter<=1; counter++){
								chance = 1 + number.nextInt(3);
								if(chance == 1){
									if(damager.getHealth() + 1 < damager.getMaxHealth()){
										damager.setHealth(damager.getHealth() + 1);
									}
									if(damager.getHealth() + 1 >= damager.getMaxHealth()){
										damager.setHealth(damager.getMaxHealth());
									}
								}
							}
						}
						if(damager.getItemInHand().getItemMeta().getLore().contains(Api.color("&7LifeSteal III"))){
							Random number = new Random();
							int chance;
							for(int counter = 1; counter<=1; counter++){
								chance = 1 + number.nextInt(2);
								if(chance == 1){
									if(damager.getHealth() + 1 < damager.getMaxHealth()){
										damager.setHealth(damager.getHealth() + 1);
									}
									if(damager.getHealth() + 1 >= damager.getMaxHealth()){
										damager.setHealth(damager.getMaxHealth());
									}
								}
							}
						}
					}
				}
			}
		}
	}
}