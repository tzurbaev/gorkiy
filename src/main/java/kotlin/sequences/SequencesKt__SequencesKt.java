package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\b\u001a@\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001e0\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001d0\u0001¨\u0006\u001f"}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", ExifInterface.GPS_DIRECTION_TRUE, "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/sequences/SequencesKt")
/* compiled from: Sequences.kt */
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    private static final <T> Sequence<T> Sequence(Function0<? extends Iterator<? extends T>> function0) {
        return new SequencesKt__SequencesKt$Sequence$1(function0);
    }

    public static final <T> Sequence<T> asSequence(Iterator it) {
        Intrinsics.checkParameterIsNotNull(it, "$this$asSequence");
        return SequencesKt.constrainOnce(new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(it));
    }

    public static final <T> Sequence<T> sequenceOf(T... tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "elements");
        return tArr.length == 0 ? SequencesKt.emptySequence() : ArraysKt.asSequence(tArr);
    }

    public static final <T> Sequence<T> emptySequence() {
        return EmptySequence.INSTANCE;
    }

    private static final <T> Sequence<T> orEmpty(Sequence<? extends T> sequence) {
        return sequence != null ? sequence : SequencesKt.emptySequence();
    }

    public static final <T> Sequence<T> ifEmpty(Sequence<? extends T> sequence, Function0<? extends Sequence<? extends T>> function0) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$ifEmpty");
        Intrinsics.checkParameterIsNotNull(function0, "defaultValue");
        return SequencesKt.sequence(new SequencesKt__SequencesKt$ifEmpty$1(sequence, function0, null));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.sequences.Sequence, kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends T>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlin.sequences.Sequence<T> flatten(kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends T>> r1) {
        /*
            java.lang.String r0 = "$this$flatten"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$flatten$1 r0 = kotlin.sequences.SequencesKt__SequencesKt$flatten$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r1 = flatten$SequencesKt__SequencesKt(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt.flatten(kotlin.sequences.Sequence):kotlin.sequences.Sequence");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.sequences.Sequence, kotlin.sequences.Sequence<? extends java.lang.Iterable<? extends T>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlin.sequences.Sequence<T> flattenSequenceOfIterable(kotlin.sequences.Sequence<? extends java.lang.Iterable<? extends T>> r1) {
        /*
            java.lang.String r0 = "$this$flatten"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            kotlin.sequences.SequencesKt__SequencesKt$flatten$2 r0 = kotlin.sequences.SequencesKt__SequencesKt$flatten$2.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r1 = flatten$SequencesKt__SequencesKt(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt.flattenSequenceOfIterable(kotlin.sequences.Sequence):kotlin.sequences.Sequence");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>>, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T, R> kotlin.sequences.Sequence<R> flatten$SequencesKt__SequencesKt(kotlin.sequences.Sequence<? extends T> r2, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>> r3) {
        /*
            boolean r0 = r2 instanceof kotlin.sequences.TransformingSequence
            if (r0 == 0) goto L_0x000b
            kotlin.sequences.TransformingSequence r2 = (kotlin.sequences.TransformingSequence) r2
            kotlin.sequences.Sequence r2 = r2.flatten$kotlin_stdlib(r3)
            return r2
        L_0x000b:
            kotlin.sequences.FlatteningSequence r0 = new kotlin.sequences.FlatteningSequence
            kotlin.sequences.SequencesKt__SequencesKt$flatten$3 r1 = kotlin.sequences.SequencesKt__SequencesKt$flatten$3.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0.<init>(r2, r1, r3)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt.flatten$SequencesKt__SequencesKt(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence");
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Sequence<? extends Pair<? extends T, ? extends R>> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$unzip");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }

    public static final <T> Sequence<T> constrainOnce(Sequence<? extends T> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$constrainOnce");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence<>(sequence);
    }

    public static final <T> Sequence<T> generateSequence(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "nextFunction");
        return SequencesKt.constrainOnce(new GeneratorSequence(function0, new SequencesKt__SequencesKt$generateSequence$1(function0)));
    }

    public static final <T> Sequence<T> generateSequence(Object obj, Function1 function1) {
        Intrinsics.checkParameterIsNotNull(function1, "nextFunction");
        if (obj == null) {
            return EmptySequence.INSTANCE;
        }
        return new GeneratorSequence<>(new SequencesKt__SequencesKt$generateSequence$2(obj), function1);
    }

    public static final <T> Sequence<T> generateSequence(Function0 function0, Function1 function1) {
        Intrinsics.checkParameterIsNotNull(function0, "seedFunction");
        Intrinsics.checkParameterIsNotNull(function1, "nextFunction");
        return new GeneratorSequence<>(function0, function1);
    }
}
