/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hwloc_topology_diff_obj_attr_uint64_s {
 *     hwloc_topology_diff_obj_attr_type_t type;
 *     hwloc_uint64_t index;
 *     hwloc_uint64_t oldvalue;
 *     hwloc_uint64_t newvalue;
 * }</code></pre>
 */
public class hwloc_topology_diff_obj_attr_uint64_s extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        INDEX,
        OLDVALUE,
        NEWVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        INDEX = layout.offsetof(1);
        OLDVALUE = layout.offsetof(2);
        NEWVALUE = layout.offsetof(3);
    }

    /**
     * Creates a {@code hwloc_topology_diff_obj_attr_uint64_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_diff_obj_attr_uint64_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("hwloc_topology_diff_obj_attr_type_t")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code index} field. */
    @NativeType("hwloc_uint64_t")
    public long index() { return nindex(address()); }
    /** @return the value of the {@code oldvalue} field. */
    @NativeType("hwloc_uint64_t")
    public long oldvalue() { return noldvalue(address()); }
    /** @return the value of the {@code newvalue} field. */
    @NativeType("hwloc_uint64_t")
    public long newvalue() { return nnewvalue(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_diff_obj_attr_uint64_s} instance for the specified memory address. */
    public static hwloc_topology_diff_obj_attr_uint64_s create(long address) {
        return wrap(hwloc_topology_diff_obj_attr_uint64_s.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_obj_attr_uint64_s createSafe(long address) {
        return address == NULL ? null : wrap(hwloc_topology_diff_obj_attr_uint64_s.class, address);
    }

    /**
     * Create a {@link hwloc_topology_diff_obj_attr_uint64_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_diff_obj_attr_uint64_s.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_obj_attr_uint64_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + hwloc_topology_diff_obj_attr_uint64_s.TYPE); }
    /** Unsafe version of {@link #index}. */
    public static long nindex(long struct) { return UNSAFE.getLong(null, struct + hwloc_topology_diff_obj_attr_uint64_s.INDEX); }
    /** Unsafe version of {@link #oldvalue}. */
    public static long noldvalue(long struct) { return UNSAFE.getLong(null, struct + hwloc_topology_diff_obj_attr_uint64_s.OLDVALUE); }
    /** Unsafe version of {@link #newvalue}. */
    public static long nnewvalue(long struct) { return UNSAFE.getLong(null, struct + hwloc_topology_diff_obj_attr_uint64_s.NEWVALUE); }

    // -----------------------------------

    /** An array of {@link hwloc_topology_diff_obj_attr_uint64_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_diff_obj_attr_uint64_s, Buffer> {

        private static final hwloc_topology_diff_obj_attr_uint64_s ELEMENT_FACTORY = hwloc_topology_diff_obj_attr_uint64_s.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_diff_obj_attr_uint64_s.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_diff_obj_attr_uint64_s#SIZEOF}, and its mark will be undefined.
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
        protected hwloc_topology_diff_obj_attr_uint64_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("hwloc_topology_diff_obj_attr_type_t")
        public int type() { return hwloc_topology_diff_obj_attr_uint64_s.ntype(address()); }
        /** @return the value of the {@code index} field. */
        @NativeType("hwloc_uint64_t")
        public long index() { return hwloc_topology_diff_obj_attr_uint64_s.nindex(address()); }
        /** @return the value of the {@code oldvalue} field. */
        @NativeType("hwloc_uint64_t")
        public long oldvalue() { return hwloc_topology_diff_obj_attr_uint64_s.noldvalue(address()); }
        /** @return the value of the {@code newvalue} field. */
        @NativeType("hwloc_uint64_t")
        public long newvalue() { return hwloc_topology_diff_obj_attr_uint64_s.nnewvalue(address()); }

    }

}