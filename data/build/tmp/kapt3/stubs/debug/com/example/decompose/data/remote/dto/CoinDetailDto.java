package com.example.decompose.data.remote.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0010\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u000eH\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0018H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0010H\u00c6\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020!H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0007H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0007H\u00c6\u0003J\t\u0010S\u001a\u00020\u0007H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\u0083\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00102\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020!H\u00c6\u0001J\u0013\u0010V\u001a\u00020\u00072\b\u0010W\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010X\u001a\u00020\u0018H\u00d6\u0001J\t\u0010Y\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010(R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010(R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=\u00a8\u0006Z"}, d2 = {"Lcom/example/decompose/data/remote/dto/CoinDetailDto;", "", "description", "", "developmentStatus", "firstDataAt", "hardwareWallet", "", "hashAlgorithm", "id", "isActive", "isNew", "lastDataAt", "links", "Lcom/example/decompose/data/remote/dto/Links;", "linksExtended", "", "Lcom/example/decompose/data/remote/dto/LinksExtended;", "message", "name", "openSource", "orgStructure", "proofType", "rank", "", "startedAt", "symbol", "tags", "Lcom/example/decompose/data/remote/dto/Tag;", "team", "Lcom/example/decompose/data/remote/dto/TeamMember;", "type", "whitepaper", "Lcom/example/decompose/data/remote/dto/Whitepaper;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/example/decompose/data/remote/dto/Links;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/example/decompose/data/remote/dto/Whitepaper;)V", "getDescription", "()Ljava/lang/String;", "getDevelopmentStatus", "getFirstDataAt", "getHardwareWallet", "()Z", "getHashAlgorithm", "getId", "getLastDataAt", "getLinks", "()Lcom/example/decompose/data/remote/dto/Links;", "getLinksExtended", "()Ljava/util/List;", "getMessage", "getName", "getOpenSource", "getOrgStructure", "getProofType", "getRank", "()I", "getStartedAt", "getSymbol", "getTags", "getTeam", "getType", "getWhitepaper", "()Lcom/example/decompose/data/remote/dto/Whitepaper;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
public final class CoinDetailDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @com.google.gson.annotations.SerializedName(value = "development_status")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String developmentStatus = null;
    @com.google.gson.annotations.SerializedName(value = "first_data_at")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstDataAt = null;
    @com.google.gson.annotations.SerializedName(value = "hardware_wallet")
    private final boolean hardwareWallet = false;
    @com.google.gson.annotations.SerializedName(value = "hash_algorithm")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String hashAlgorithm = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @com.google.gson.annotations.SerializedName(value = "is_active")
    private final boolean isActive = false;
    @com.google.gson.annotations.SerializedName(value = "is_new")
    private final boolean isNew = false;
    @com.google.gson.annotations.SerializedName(value = "last_data_at")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastDataAt = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.decompose.data.remote.dto.Links links = null;
    @com.google.gson.annotations.SerializedName(value = "links_extended")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.decompose.data.remote.dto.LinksExtended> linksExtended = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "open_source")
    private final boolean openSource = false;
    @com.google.gson.annotations.SerializedName(value = "org_structure")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String orgStructure = null;
    @com.google.gson.annotations.SerializedName(value = "proof_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String proofType = null;
    private final int rank = 0;
    @com.google.gson.annotations.SerializedName(value = "started_at")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String startedAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String symbol = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.decompose.data.remote.dto.Tag> tags = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.decompose.data.remote.dto.TeamMember> team = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.decompose.data.remote.dto.Whitepaper whitepaper = null;
    
    public CoinDetailDto(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String developmentStatus, @org.jetbrains.annotations.NotNull
    java.lang.String firstDataAt, boolean hardwareWallet, @org.jetbrains.annotations.NotNull
    java.lang.String hashAlgorithm, @org.jetbrains.annotations.NotNull
    java.lang.String id, boolean isActive, boolean isNew, @org.jetbrains.annotations.NotNull
    java.lang.String lastDataAt, @org.jetbrains.annotations.NotNull
    com.example.decompose.data.remote.dto.Links links, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.decompose.data.remote.dto.LinksExtended> linksExtended, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String name, boolean openSource, @org.jetbrains.annotations.NotNull
    java.lang.String orgStructure, @org.jetbrains.annotations.NotNull
    java.lang.String proofType, int rank, @org.jetbrains.annotations.NotNull
    java.lang.String startedAt, @org.jetbrains.annotations.NotNull
    java.lang.String symbol, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.decompose.data.remote.dto.Tag> tags, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.decompose.data.remote.dto.TeamMember> team, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    com.example.decompose.data.remote.dto.Whitepaper whitepaper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDevelopmentStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstDataAt() {
        return null;
    }
    
    public final boolean getHardwareWallet() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHashAlgorithm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final boolean isNew() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastDataAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.remote.dto.Links getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.decompose.data.remote.dto.LinksExtended> getLinksExtended() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getOpenSource() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrgStructure() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProofType() {
        return null;
    }
    
    public final int getRank() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.decompose.data.remote.dto.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.decompose.data.remote.dto.TeamMember> getTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.remote.dto.Whitepaper getWhitepaper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.remote.dto.Links component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.decompose.data.remote.dto.LinksExtended> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.decompose.data.remote.dto.Tag> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.decompose.data.remote.dto.TeamMember> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.remote.dto.Whitepaper component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.remote.dto.CoinDetailDto copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String developmentStatus, @org.jetbrains.annotations.NotNull
    java.lang.String firstDataAt, boolean hardwareWallet, @org.jetbrains.annotations.NotNull
    java.lang.String hashAlgorithm, @org.jetbrains.annotations.NotNull
    java.lang.String id, boolean isActive, boolean isNew, @org.jetbrains.annotations.NotNull
    java.lang.String lastDataAt, @org.jetbrains.annotations.NotNull
    com.example.decompose.data.remote.dto.Links links, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.decompose.data.remote.dto.LinksExtended> linksExtended, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String name, boolean openSource, @org.jetbrains.annotations.NotNull
    java.lang.String orgStructure, @org.jetbrains.annotations.NotNull
    java.lang.String proofType, int rank, @org.jetbrains.annotations.NotNull
    java.lang.String startedAt, @org.jetbrains.annotations.NotNull
    java.lang.String symbol, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.decompose.data.remote.dto.Tag> tags, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.decompose.data.remote.dto.TeamMember> team, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    com.example.decompose.data.remote.dto.Whitepaper whitepaper) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}