#!/bin/bash

for i in /c/Minecraft/forge-server/forge-1.1*/; do
	mkdir -p $i/mods
	cp -fv build/libs/*-all.jar $i/mods/
done
