// automatically generated by the FlatBuffers compiler, do not modify

package com.gompang.packet;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class HeartBeat extends Table {
  public static HeartBeat getRootAsHeartBeat(ByteBuffer _bb) { return getRootAsHeartBeat(_bb, new HeartBeat()); }
  public static HeartBeat getRootAsHeartBeat(ByteBuffer _bb, HeartBeat obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public HeartBeat __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void startHeartBeat(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endHeartBeat(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

