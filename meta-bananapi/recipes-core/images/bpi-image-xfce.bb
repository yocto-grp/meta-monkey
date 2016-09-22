# Base this image on core-image-minimal
#include recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Image with xfce"

#IMAGE_FEATURES += "splash package-management x11-base ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image


IMAGE_INSTALL += " \
                  alsa-utils \
                  alsa-utils-aplay \
"

RM_WORK_EXCLUDE += "bpi-image-xfce"
