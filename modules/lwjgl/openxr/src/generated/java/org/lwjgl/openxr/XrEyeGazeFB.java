/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the eye gaze direction.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the returned {@code isValid} is true, the runtime <b>must</b> return {@code gazePose} and {@code gazeConfidence}.</p>
 * 
 * <p>If the returned {@code isValid} is false, it indicates either the eye tracker did not detect the eye gaze or the application lost input focus.</p>
 * 
 * <p>The eye gaze pose is natively oriented with +Y up, +X to the right, and -Z forward and not gravity-aligned, similar to the {@link XR10#XR_REFERENCE_SPACE_TYPE_VIEW REFERENCE_SPACE_TYPE_VIEW}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using {@link XrEyeGazeFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEyeGazesFB}, {@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEyeGazeFB {
 *     XrBool32 {@link #isValid};
 *     {@link XrPosef XrPosef} {@link #gazePose};
 *     float {@link #gazeConfidence};
 * }</code></pre>
 */
public class XrEyeGazeFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISVALID,
        GAZEPOSE,
        GAZECONFIDENCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISVALID = layout.offsetof(0);
        GAZEPOSE = layout.offsetof(1);
        GAZECONFIDENCE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrEyeGazeFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeGazeFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@code XrBool32} indicating if the returned gazePose is valid. Callers <b>should</b> check the validity of pose prior to use. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** an {@link XrPosef} describing the position and orientation of the user’s eye. The pose is represented in the coordinate system provided by {@link XrEyeGazesInfoFB}{@code ::baseSpace}. */
    public XrPosef gazePose() { return ngazePose(address()); }
    /** a {@code float} value between 0 and 1 that represents the confidence for eye pose. A value of 0 represents no confidence in the pose returned, and a value of 1 means maximum confidence in the returned eye pose. */
    public float gazeConfidence() { return ngazeConfidence(address()); }

    /** Sets the specified value to the {@link #isValid} field. */
    public XrEyeGazeFB isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #gazePose} field. */
    public XrEyeGazeFB gazePose(XrPosef value) { ngazePose(address(), value); return this; }
    /** Passes the {@link #gazePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyeGazeFB gazePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(gazePose()); return this; }
    /** Sets the specified value to the {@link #gazeConfidence} field. */
    public XrEyeGazeFB gazeConfidence(float value) { ngazeConfidence(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeGazeFB set(
        boolean isValid,
        XrPosef gazePose,
        float gazeConfidence
    ) {
        isValid(isValid);
        gazePose(gazePose);
        gazeConfidence(gazeConfidence);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyeGazeFB set(XrEyeGazeFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeGazeFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeGazeFB malloc() {
        return wrap(XrEyeGazeFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEyeGazeFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeGazeFB calloc() {
        return wrap(XrEyeGazeFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEyeGazeFB} instance allocated with {@link BufferUtils}. */
    public static XrEyeGazeFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEyeGazeFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEyeGazeFB} instance for the specified memory address. */
    public static XrEyeGazeFB create(long address) {
        return wrap(XrEyeGazeFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeGazeFB createSafe(long address) {
        return address == NULL ? null : wrap(XrEyeGazeFB.class, address);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEyeGazeFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeGazeFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrEyeGazeFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazeFB malloc(MemoryStack stack) {
        return wrap(XrEyeGazeFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEyeGazeFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazeFB calloc(MemoryStack stack) {
        return wrap(XrEyeGazeFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return UNSAFE.getInt(null, struct + XrEyeGazeFB.ISVALID); }
    /** Unsafe version of {@link #gazePose}. */
    public static XrPosef ngazePose(long struct) { return XrPosef.create(struct + XrEyeGazeFB.GAZEPOSE); }
    /** Unsafe version of {@link #gazeConfidence}. */
    public static float ngazeConfidence(long struct) { return UNSAFE.getFloat(null, struct + XrEyeGazeFB.GAZECONFIDENCE); }

    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { UNSAFE.putInt(null, struct + XrEyeGazeFB.ISVALID, value); }
    /** Unsafe version of {@link #gazePose(XrPosef) gazePose}. */
    public static void ngazePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrEyeGazeFB.GAZEPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #gazeConfidence(float) gazeConfidence}. */
    public static void ngazeConfidence(long struct, float value) { UNSAFE.putFloat(null, struct + XrEyeGazeFB.GAZECONFIDENCE, value); }

    // -----------------------------------

    /** An array of {@link XrEyeGazeFB} structs. */
    public static class Buffer extends StructBuffer<XrEyeGazeFB, Buffer> implements NativeResource {

        private static final XrEyeGazeFB ELEMENT_FACTORY = XrEyeGazeFB.create(-1L);

        /**
         * Creates a new {@code XrEyeGazeFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeGazeFB#SIZEOF}, and its mark will be undefined.
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
        protected XrEyeGazeFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEyeGazeFB#isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrEyeGazeFB.nisValid(address()) != 0; }
        /** @return a {@link XrPosef} view of the {@link XrEyeGazeFB#gazePose} field. */
        public XrPosef gazePose() { return XrEyeGazeFB.ngazePose(address()); }
        /** @return the value of the {@link XrEyeGazeFB#gazeConfidence} field. */
        public float gazeConfidence() { return XrEyeGazeFB.ngazeConfidence(address()); }

        /** Sets the specified value to the {@link XrEyeGazeFB#isValid} field. */
        public XrEyeGazeFB.Buffer isValid(@NativeType("XrBool32") boolean value) { XrEyeGazeFB.nisValid(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrEyeGazeFB#gazePose} field. */
        public XrEyeGazeFB.Buffer gazePose(XrPosef value) { XrEyeGazeFB.ngazePose(address(), value); return this; }
        /** Passes the {@link XrEyeGazeFB#gazePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyeGazeFB.Buffer gazePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(gazePose()); return this; }
        /** Sets the specified value to the {@link XrEyeGazeFB#gazeConfidence} field. */
        public XrEyeGazeFB.Buffer gazeConfidence(float value) { XrEyeGazeFB.ngazeConfidence(address(), value); return this; }

    }

}