#!/bin/bash

for i in /c/Minecraft/forge-server/forge-1.1*/; do
	rm -fv $i/mods/*-all.jar
done
