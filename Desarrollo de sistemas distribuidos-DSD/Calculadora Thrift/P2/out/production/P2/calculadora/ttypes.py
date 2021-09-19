#
# Autogenerated by Thrift Compiler (0.13.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
from thrift.TRecursive import fix_spec

import sys

from thrift.transport import TTransport
all_structs = []


class operacionBasica(object):
    """
    Attributes:
     - a
     - b

    """


    def __init__(self, a=float(0), b=float(0),):
        self.a = a
        self.b = b

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.DOUBLE:
                    self.a = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.DOUBLE:
                    self.b = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('operacionBasica')
        if self.a is not None:
            oprot.writeFieldBegin('a', TType.DOUBLE, 1)
            oprot.writeDouble(self.a)
            oprot.writeFieldEnd()
        if self.b is not None:
            oprot.writeFieldBegin('b', TType.DOUBLE, 2)
            oprot.writeDouble(self.b)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class operacionVectores(object):
    """
    Attributes:
     - v1
     - v2

    """


    def __init__(self, v1=None, v2=None,):
        self.v1 = v1
        self.v2 = v2

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.v1 = []
                    (_etype3, _size0) = iprot.readListBegin()
                    for _i4 in range(_size0):
                        _elem5 = iprot.readDouble()
                        self.v1.append(_elem5)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.LIST:
                    self.v2 = []
                    (_etype9, _size6) = iprot.readListBegin()
                    for _i10 in range(_size6):
                        _elem11 = iprot.readDouble()
                        self.v2.append(_elem11)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('operacionVectores')
        if self.v1 is not None:
            oprot.writeFieldBegin('v1', TType.LIST, 1)
            oprot.writeListBegin(TType.DOUBLE, len(self.v1))
            for iter12 in self.v1:
                oprot.writeDouble(iter12)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.v2 is not None:
            oprot.writeFieldBegin('v2', TType.LIST, 2)
            oprot.writeListBegin(TType.DOUBLE, len(self.v2))
            for iter13 in self.v2:
                oprot.writeDouble(iter13)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class operacionInvalida(TException):
    """
    Attributes:
     - tipo
     - why

    """


    def __init__(self, tipo=None, why=None,):
        self.tipo = tipo
        self.why = why

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.tipo = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.why = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('operacionInvalida')
        if self.tipo is not None:
            oprot.writeFieldBegin('tipo', TType.STRING, 1)
            oprot.writeString(self.tipo.encode('utf-8') if sys.version_info[0] == 2 else self.tipo)
            oprot.writeFieldEnd()
        if self.why is not None:
            oprot.writeFieldBegin('why', TType.STRING, 2)
            oprot.writeString(self.why.encode('utf-8') if sys.version_info[0] == 2 else self.why)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __str__(self):
        return repr(self)

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class segundoGrado(object):
    """
    Attributes:
     - a
     - b
     - c

    """


    def __init__(self, a=None, b=None, c=None,):
        self.a = a
        self.b = b
        self.c = c

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.DOUBLE:
                    self.a = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.DOUBLE:
                    self.b = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.DOUBLE:
                    self.c = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('segundoGrado')
        if self.a is not None:
            oprot.writeFieldBegin('a', TType.DOUBLE, 1)
            oprot.writeDouble(self.a)
            oprot.writeFieldEnd()
        if self.b is not None:
            oprot.writeFieldBegin('b', TType.DOUBLE, 2)
            oprot.writeDouble(self.b)
            oprot.writeFieldEnd()
        if self.c is not None:
            oprot.writeFieldBegin('c', TType.DOUBLE, 3)
            oprot.writeDouble(self.c)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class combinada(object):
    """
    Attributes:
     - nums
     - op

    """


    def __init__(self, nums=None, op=None,):
        self.nums = nums
        self.op = op

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.nums = []
                    (_etype17, _size14) = iprot.readListBegin()
                    for _i18 in range(_size14):
                        _elem19 = iprot.readDouble()
                        self.nums.append(_elem19)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.LIST:
                    self.op = []
                    (_etype23, _size20) = iprot.readListBegin()
                    for _i24 in range(_size20):
                        _elem25 = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                        self.op.append(_elem25)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('combinada')
        if self.nums is not None:
            oprot.writeFieldBegin('nums', TType.LIST, 1)
            oprot.writeListBegin(TType.DOUBLE, len(self.nums))
            for iter26 in self.nums:
                oprot.writeDouble(iter26)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.op is not None:
            oprot.writeFieldBegin('op', TType.LIST, 2)
            oprot.writeListBegin(TType.STRING, len(self.op))
            for iter27 in self.op:
                oprot.writeString(iter27.encode('utf-8') if sys.version_info[0] == 2 else iter27)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
all_structs.append(operacionBasica)
operacionBasica.thrift_spec = (
    None,  # 0
    (1, TType.DOUBLE, 'a', None, float(0), ),  # 1
    (2, TType.DOUBLE, 'b', None, float(0), ),  # 2
)
all_structs.append(operacionVectores)
operacionVectores.thrift_spec = (
    None,  # 0
    (1, TType.LIST, 'v1', (TType.DOUBLE, None, False), None, ),  # 1
    (2, TType.LIST, 'v2', (TType.DOUBLE, None, False), None, ),  # 2
)
all_structs.append(operacionInvalida)
operacionInvalida.thrift_spec = (
    None,  # 0
    (1, TType.STRING, 'tipo', 'UTF8', None, ),  # 1
    (2, TType.STRING, 'why', 'UTF8', None, ),  # 2
)
all_structs.append(segundoGrado)
segundoGrado.thrift_spec = (
    None,  # 0
    (1, TType.DOUBLE, 'a', None, None, ),  # 1
    (2, TType.DOUBLE, 'b', None, None, ),  # 2
    (3, TType.DOUBLE, 'c', None, None, ),  # 3
)
all_structs.append(combinada)
combinada.thrift_spec = (
    None,  # 0
    (1, TType.LIST, 'nums', (TType.DOUBLE, None, False), None, ),  # 1
    (2, TType.LIST, 'op', (TType.STRING, 'UTF8', False), None, ),  # 2
)
fix_spec(all_structs)
del all_structs