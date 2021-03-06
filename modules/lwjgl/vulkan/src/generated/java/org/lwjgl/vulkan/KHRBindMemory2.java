/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension provides versions of {@link VK10#vkBindBufferMemory BindBufferMemory} and {@link VK10#vkBindImageMemory BindImageMemory} that allow multiple bindings to be performed at once, and are extensible.
 * 
 * <p>This extension also introduces {@link #VK_IMAGE_CREATE_ALIAS_BIT_KHR IMAGE_CREATE_ALIAS_BIT_KHR}, which allows "{@code identical}" images that alias the same memory to interpret the contents consistently, even across image layout changes.</p>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_bind_memory2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>158</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector @tobski</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRBindMemory2 {

    /** The extension specification version. */
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR  = 1000157001;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x400;

    protected KHRBindMemory2() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_bind_memory2") && VK.checkExtension("VK_KHR_bind_memory2",
               VK.isSupported(provider, "vkBindBufferMemory2KHR", caps)
            && VK.isSupported(provider, "vkBindImageMemory2KHR", caps)
        );
    }

    // --- [ vkBindBufferMemory2KHR ] ---

    /**
     * Unsafe version of: {@link #vkBindBufferMemory2KHR BindBufferMemory2KHR}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindBufferMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * See {@link VK11#vkBindBufferMemory2 BindBufferMemory2}.
     *
     * @param device     the logical device that owns the buffers and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindBufferMemoryInfo}, describing buffers and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindBufferMemory2KHR(VkDevice device, @NativeType("VkBindBufferMemoryInfo const *") VkBindBufferMemoryInfo.Buffer pBindInfos) {
        return nvkBindBufferMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkBindImageMemory2KHR ] ---

    /**
     * Unsafe version of: {@link #vkBindImageMemory2KHR BindImageMemory2KHR}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindImageMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, device.address(), bindInfoCount, pBindInfos);
    }

    /**
     * See {@link VK11#vkBindImageMemory2 BindImageMemory2}.
     *
     * @param device     the logical device that owns the images and memory.
     * @param pBindInfos a pointer to an array of structures of type {@link VkBindImageMemoryInfo}, describing images and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindImageMemory2KHR(VkDevice device, @NativeType("VkBindImageMemoryInfo const *") VkBindImageMemoryInfo.Buffer pBindInfos) {
        return nvkBindImageMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

}