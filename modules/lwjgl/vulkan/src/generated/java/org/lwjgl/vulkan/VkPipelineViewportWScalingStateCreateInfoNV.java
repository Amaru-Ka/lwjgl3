/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created pipeline viewport W scaling state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVClipSpaceWScaling#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV}</li>
 * <li>{@code viewportCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkViewportWScalingNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code viewportWScalingEnable} &ndash; controls whether viewport <b>W</b> scaling is enabled.</li>
 * <li>{@code viewportCount} &ndash; the number of viewports used by <b>W</b> scaling, and <b>must</b> match the number of viewports in the pipeline if viewport <b>W</b> scaling is enabled.</li>
 * <li>{@code pViewportWScalings} &ndash; a pointer to an array of {@link VkViewportWScalingNV} structures, which define the <b>W</b> scaling parameters for the corresponding viewport. If the viewport <b>W</b> scaling state is dynamic, this member is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineViewportWScalingStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 viewportWScalingEnable;
 *     uint32_t viewportCount;
 *     {@link VkViewportWScalingNV VkViewportWScalingNV const} * pViewportWScalings;
 * }</code></pre>
 */
public class VkPipelineViewportWScalingStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIEWPORTWSCALINGENABLE,
        VIEWPORTCOUNT,
        PVIEWPORTWSCALINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWPORTWSCALINGENABLE = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PVIEWPORTWSCALINGS = layout.offsetof(4);
    }

    VkPipelineViewportWScalingStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineViewportWScalingStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportWScalingStateCreateInfoNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code viewportWScalingEnable} field. */
    @NativeType("VkBool32")
    public boolean viewportWScalingEnable() { return nviewportWScalingEnable(address()) != 0; }
    /** Returns the value of the {@code viewportCount} field. */
    @NativeType("uint32_t")
    public int viewportCount() { return nviewportCount(address()); }
    /** Returns a {@link VkViewportWScalingNV.Buffer} view of the struct array pointed to by the {@code pViewportWScalings} field. */
    @NativeType("VkViewportWScalingNV const *")
    public VkViewportWScalingNV.Buffer pViewportWScalings() { return npViewportWScalings(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportWScalingStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportWScalingStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code viewportWScalingEnable} field. */
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnable(@NativeType("VkBool32") boolean value) { nviewportWScalingEnable(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link VkViewportWScalingNV.Buffer} to the {@code pViewportWScalings} field. */
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalings(@NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer value) { npViewportWScalings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportWScalingStateCreateInfoNV set(
        int sType,
        long pNext,
        boolean viewportWScalingEnable,
        VkViewportWScalingNV.Buffer pViewportWScalings
    ) {
        sType(sType);
        pNext(pNext);
        viewportWScalingEnable(viewportWScalingEnable);
        pViewportWScalings(pViewportWScalings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportWScalingStateCreateInfoNV set(VkPipelineViewportWScalingStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportWScalingStateCreateInfoNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportWScalingStateCreateInfoNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportWScalingStateCreateInfoNV create() {
        return new VkPipelineViewportWScalingStateCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportWScalingStateCreateInfoNV create(long address) {
        return new VkPipelineViewportWScalingStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportWScalingStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineViewportWScalingStateCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineViewportWScalingStateCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportWScalingStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportWScalingStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportWScalingStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #viewportWScalingEnable}. */
    public static int nviewportWScalingEnable(long struct) { return memGetInt(struct + VkPipelineViewportWScalingStateCreateInfoNV.VIEWPORTWSCALINGENABLE); }
    /** Unsafe version of {@link #viewportCount}. */
    public static int nviewportCount(long struct) { return memGetInt(struct + VkPipelineViewportWScalingStateCreateInfoNV.VIEWPORTCOUNT); }
    /** Unsafe version of {@link #pViewportWScalings}. */
    public static VkViewportWScalingNV.Buffer npViewportWScalings(long struct) { return VkViewportWScalingNV.create(memGetAddress(struct + VkPipelineViewportWScalingStateCreateInfoNV.PVIEWPORTWSCALINGS), nviewportCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportWScalingStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportWScalingStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #viewportWScalingEnable(boolean) viewportWScalingEnable}. */
    public static void nviewportWScalingEnable(long struct, int value) { memPutInt(struct + VkPipelineViewportWScalingStateCreateInfoNV.VIEWPORTWSCALINGENABLE, value); }
    /** Sets the specified value to the {@code viewportCount} field of the specified {@code struct}. */
    public static void nviewportCount(long struct, int value) { memPutInt(struct + VkPipelineViewportWScalingStateCreateInfoNV.VIEWPORTCOUNT, value); }
    /** Unsafe version of {@link #pViewportWScalings(VkViewportWScalingNV.Buffer) pViewportWScalings}. */
    public static void npViewportWScalings(long struct, VkViewportWScalingNV.Buffer value) { memPutAddress(struct + VkPipelineViewportWScalingStateCreateInfoNV.PVIEWPORTWSCALINGS, value.address()); nviewportCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineViewportWScalingStateCreateInfoNV.PVIEWPORTWSCALINGS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportWScalingStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportWScalingStateCreateInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineViewportWScalingStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportWScalingStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPipelineViewportWScalingStateCreateInfoNV newInstance(long address) {
            return new VkPipelineViewportWScalingStateCreateInfoNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportWScalingStateCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportWScalingStateCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code viewportWScalingEnable} field. */
        @NativeType("VkBool32")
        public boolean viewportWScalingEnable() { return VkPipelineViewportWScalingStateCreateInfoNV.nviewportWScalingEnable(address()) != 0; }
        /** Returns the value of the {@code viewportCount} field. */
        @NativeType("uint32_t")
        public int viewportCount() { return VkPipelineViewportWScalingStateCreateInfoNV.nviewportCount(address()); }
        /** Returns a {@link VkViewportWScalingNV.Buffer} view of the struct array pointed to by the {@code pViewportWScalings} field. */
        @NativeType("VkViewportWScalingNV const *")
        public VkViewportWScalingNV.Buffer pViewportWScalings() { return VkPipelineViewportWScalingStateCreateInfoNV.npViewportWScalings(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportWScalingStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportWScalingStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportWScalingStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportWScalingStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code viewportWScalingEnable} field. */
        public VkPipelineViewportWScalingStateCreateInfoNV.Buffer viewportWScalingEnable(@NativeType("VkBool32") boolean value) { VkPipelineViewportWScalingStateCreateInfoNV.nviewportWScalingEnable(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link VkViewportWScalingNV.Buffer} to the {@code pViewportWScalings} field. */
        public VkPipelineViewportWScalingStateCreateInfoNV.Buffer pViewportWScalings(@NativeType("VkViewportWScalingNV const *") VkViewportWScalingNV.Buffer value) { VkPipelineViewportWScalingStateCreateInfoNV.npViewportWScalings(address(), value); return this; }

    }

}