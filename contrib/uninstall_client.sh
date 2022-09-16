#!/bin/bash

for i in /c/Minecraft/instances/Forge*/; do
	rm -fv "$i/.minecraft/mods/"*-all.jar
done
