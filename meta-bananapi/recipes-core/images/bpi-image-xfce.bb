# Base this image on core-image-minimal
#include recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Image with xfce"

#IMAGE_FEATURES += "splash package-management x11-base ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image


IMAGE_INSTALL += " \
                  alsa-utils \
                  alsa-utils-aplay \
                  directfb \
                  directfb-examples \
"

RM_WORK_EXCLUDE += "bpi-image-xfce"

IMAGE_POSTPROCESS_COMMAND += "mytest ;"

#generate_corefsmd5
mytest() {
    echo "====================================="
    touch "/home/yuanguang/my-yocto/build/bpi/tmp/deploy/images/bpi/mytest"
    ls ${IMAGE_ROOTFS}
    ls ${DEPLOY_DIR_IMAGE}

    cd ${IMAGE_ROOTFS}
    find ./ -type f | xargs md5sum | sed 's/\.//' > /home/yuanguang/my-yocto/build/bpi/tmp/deploy/images/bpi/mytest
}

