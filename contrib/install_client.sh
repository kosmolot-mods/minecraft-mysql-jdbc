#!/bin/bash

for i in /c/Minecraft/instances/Forge*/; do
	cp -fv build/libs/*-all.jar "$i/.minecraft/mods/"
done
