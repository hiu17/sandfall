# Sandfall

A Fabric mod for Minecraft 1.20.1 that prevents sand, red sand, and gravel from falling.

## Features
- Stops falling block scheduled ticks for sand, red sand, and gravel.
- Works server-side and remains lightweight.
- Designed for Fabric 1.20.1.

## Build
```bash
gradle wrapper
gradle build
```

## Notes
This mod cancels the scheduled falling behavior for vanilla sand-like blocks, keeping them in place after gravity updates.
