setenv bootargs console=ttyS0,115200 disp.screen0_output_mode=EDID:1024x768p50 hdmi.audio=EDID:0 root=/dev/mmcblk0p2 rootfstype=ext3 elevator=deadline rootwait
fatload mmc 0 0x43000000 script.bin;
fatload mmc 0 0x48000000 uImage;bootm 0x48000000;
