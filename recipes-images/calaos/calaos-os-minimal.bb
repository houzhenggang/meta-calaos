# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	"
IMAGE_FEATURES += "ssh-server-dropbear splash"
IMG_ROOTFS_TYPE = "btrfs"
IMAGE_FSTYPES = "calaos-ddimg"  